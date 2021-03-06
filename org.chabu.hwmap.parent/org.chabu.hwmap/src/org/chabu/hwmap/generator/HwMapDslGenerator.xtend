/*
 * generated by Xtext 2.19.0
 */
package org.chabu.hwmap.generator

import java.nio.file.Paths
import java.util.ArrayList
import java.util.List
import org.chabu.hwmap.hwMapDsl.MemoryMap
import org.chabu.hwmap.hwMapDsl.Output
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.diagnostics.ExceptionDiagnostic
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.chabu.hwmap.hwMapDsl.RegisterBits
import org.chabu.hwmap.hwMapDsl.Register
import org.chabu.hwmap.hwMapDsl.Block
import org.chabu.hwmap.hwMapDsl.Instantiation
import org.chabu.hwmap.generator.HwMapDslGenerator.Struct
import org.chabu.hwmap.hwMapDsl.Component

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class HwMapDslGenerator extends AbstractGenerator {
	
	static val log = Logger::getLogger(HwMapDslGenerator)

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for( mm : resource.allContents.filter(MemoryMap).toIterable ){
			try {
				
				prepareData(mm)
				for( output : mm.outputs ){
					switch output.mode {
						case 'C': generateC( mm, fsa, output )
						case 'VHDL': generateVhdl( mm, fsa, output )
					}
				}
					
			}
			catch( RuntimeException e ){
				mm.eResource.errors.add( new ExceptionDiagnostic( e ) )
				log.error("Generator Exception", e);
			}
		}
	}
	
	private static class Constant {
		String name
		String typeVhdl
		String value
		String valueVhdl
	}
	
	private static class StructField {
		String type
		String name
		String arrayDim
	}
	
	private static class Struct {
		int size
		String name
		List<StructField> fields = new ArrayList
	}
	
	private static class VhdlComp {
		String name
		int    addrIdxHi;
		val blocks = new ArrayList<VhdlBlock>();
		val insts  = new ArrayList<VhdlInstSelect>();
	}
	
	private static class VhdlBlock {
		String name
		int    addrIdxHi;
		int    addrIdxLo;
		val registers = new ArrayList<VhdlRegister>();
	}
	
	private static class VhdlInstSelect {
		String name
		int    addrIdxHi;
		int    addrIdxLo;
		String addrBits;
	}
	
	private static class VhdlRegister {
		String name
		String addrBits;
	}
	
	val vhdlComps = new ArrayList<VhdlComp>();
	var vhdlComp = new VhdlComp;
	
	val constants = new ArrayList<Constant>();
	val structs = new ArrayList<Struct>();
	val align = 4
	var nextOffset = 0
	var dummyIndex = 0
		
	def private prepareData(MemoryMap mm) {
		
		constants.clear()
		structs.clear()
		vhdlComps.clear()
		
		for( comp : mm.components ){
			val compStruct = new Struct
			compStruct.name = comp.name
			
			vhdlComp = new VhdlComp()
			vhdlComps.add(vhdlComp)
			vhdlComp.name = comp.name
			vhdlComp.addrIdxHi = Integer::numberOfTrailingZeros(comp.size)-1
			
			for( block : comp.blocks ){
				handleBlock( block, comp )
			}

			dummyIndex = 0
			nextOffset = 0
			for( inst : comp.insts ){
				handleInstance( inst, compStruct, comp )
			}
			
			structs.add(compStruct)
		}
	}
	
	def private handleBlock(Block block, Component comp) {
		dummyIndex = 0
		nextOffset = 0
		val struct = new Struct
		struct.name = '''«comp.name»_«block.name»'''
		struct.size = block.size
		val vhdlBlock = new VhdlBlock()
		vhdlBlock.name = block.name
		vhdlBlock.addrIdxHi = Integer::numberOfTrailingZeros(block.size)-1
		vhdlBlock.addrIdxLo = 2
		vhdlComp.blocks.add(vhdlBlock)
		
		for( reg : block.regs ){
			handleRegister( reg, struct.name, block, struct, vhdlBlock )
		}
		val fillSize = (struct.size - nextOffset) / align;
		if( fillSize > 0 ) {
			fillDummy( struct, fillSize, dummyIndex++ )
		}
		
		structs.add(struct)

	}
	
	def private handleInstance(Instantiation inst, Struct compStruct, Component comp ) {
		val field = new StructField
		val instName = inst.name !== null ? inst.name : inst.type.name
		field.name = '''«instName»'''
		field.type = '''struct «compStruct.name»_«inst.type.name»'''
	
		val fillSize = (inst.addr - nextOffset) / align;
		if( fillSize > 0 ){
			fillDummy( compStruct, fillSize, dummyIndex++ )
			nextOffset = inst.addr
		}
		compStruct.fields.add(field)
		val block = inst.type;
		
		val vhdlInstSelect = new VhdlInstSelect()
		vhdlInstSelect.addrIdxHi = vhdlComp.addrIdxHi
		vhdlInstSelect.addrIdxLo =  Integer::numberOfTrailingZeros(block.size)
		vhdlInstSelect.addrBits = bitsFromInt( inst.addr, vhdlInstSelect.addrIdxHi, vhdlInstSelect.addrIdxLo )
		vhdlInstSelect.name = instName
		vhdlComp.insts.add(vhdlInstSelect)
		
		nextOffset += block.size
	}
	
	def private String bitsFromInt( int value, int idxHi, int idxLo ){
		val sb = new StringBuilder
		for( var i = idxHi; i >= idxLo; i-- ) {
			val bitMask = (1<<i) as int
			val bitVal = bitMask.bitwiseAnd(value) != 0
			sb.append( bitVal ? '1' : '0')
		}
		return sb.toString
	}
	def private handleRegister(Register reg, String structName, Block block, Struct struct, VhdlBlock vhdlBlock ) {
		val field = new StructField
		val fieldFqn = '''«structName»_«reg.name»'''
		field.name = reg.name
		field.type = 'uint32'
		
		val vhdlRegister = new VhdlRegister()
		vhdlRegister.addrBits = bitsFromInt( reg.addr, vhdlBlock.addrIdxHi, vhdlBlock.addrIdxLo );
		vhdlRegister.name = reg.name
		vhdlBlock.registers.add(vhdlRegister)
			
		
		if( reg.addr > nextOffset ){
			val arraySize = (reg.addr - nextOffset) / align;
			fillDummy( struct, arraySize, dummyIndex++ )
		}
		nextOffset = reg.addr + align
		for( const : reg.consts ){
			addConstHex( '''«fieldFqn»_CONST_«const.name»''', const.value )
		}
		for( bits : reg.bits ){
			handleBits( bits, reg.name, fieldFqn )
		}
		struct.fields.add(field)
	}
	
	def private handleBits(RegisterBits bits, String regName, String fieldFqn ) {
		val bitsName = '''«fieldFqn»_«bits.name»'''
		val highBit = bits.range.left
		val lowBit = ( bits.range.right !== null ) ? bits.range.right : bits.range.left
		val width = highBit - lowBit +1
		val mask = (( 1 << width ) - 1) << lowBit
		
		addConst( '''«bitsName»_LSB''', lowBit )
		addConst( '''«bitsName»_MSB''', highBit )
		addConst( '''«bitsName»_WIDTH''', width )
		addConstHex( '''«bitsName»_MASK''', mask )
		
		for( const : bits.consts ){
			addConstHex( '''«bitsName»_CONST_«const.name»''', const.value )
		}
	}
	
	def private void fillDummy( Struct struct, int wordSize, int dummyIndex ){
		val dummyField = new StructField
		dummyField.name = '''__dummy_«dummyIndex»'''
		dummyField.type = 'uint32'
		if( wordSize > 1 ){
			dummyField.arrayDim = String.format("[0x%X]", wordSize)
		}
		struct.fields.add(dummyField)
	}

	def private void addConst( String name, int value ){
		val c = new Constant()
		c.name = name
		c.typeVhdl = '''integer'''
		c.value = Integer.toString(value)
		c.valueVhdl = Integer.toString(value)
		constants.add(c)
	}
	
	def private void addConstHex( String name, int value ){
		val c = new Constant()
		c.name = name
		c.typeVhdl = '''std_logic_vector( 31 downto 0 )'''
		c.value = String.format("0x%X", value)
		c.valueVhdl = String.format("x\"%08X\"", value )
		constants.add(c)
	}
	
	def private void generateC( MemoryMap mm, IFileSystemAccess2 fsa, Output output ){
		
		val id = Paths.get(output.path).fileName.toString
			.toUpperCase
			.replaceAll("[.-]", "_")
		
		
		log.info( String::format("Write C header: %s", output.path ))
		fsa.generateFile(output.path, '''
		// generated by HwMap : https://github.com/frankbenoit/HwMap
		#ifndef «id»
		#define «id»
		
		«FOR c:constants»
		#define «c.name» «c.value»
		«ENDFOR»
		«FOR s:structs»
		
		struct «s.name» {
		    «FOR f:s.fields»
		    «f.type» «f.name»«f.arrayDim»;
		    «ENDFOR»
		};
		«ENDFOR»
		
		#endif
		''');
	}
	def private void generateVhdl( MemoryMap mm, IFileSystemAccess2 fsa, Output output ){
		
		val id = Paths.get(output.path).fileName.toString
			.toLowerCase
			.replaceAll("\\.vhd", "")
			.replaceAll("[.-]", "_")

		log.info( String::format("Write VHDL package: %s", output.path ))
		fsa.generateFile(output.path, '''
		-- generated by HwMap : https://github.com/frankbenoit/HwMap
		library IEEE;
		use IEEE.STD_LOGIC_1164.ALL;
		
		package «id»_pck is
		
		  «FOR c:constants»
		  constant «c.name» : «c.typeVhdl» := «c.valueVhdl»;
		  «ENDFOR»
		  «FOR c:vhdlComps»
		  «FOR b:c.blocks»
		  type Block_«c.name»_«b.name»_Selection is record
		    UnmappedSelection : std_logic;
		    «FOR r:b.registers»
		 «"    "»Selected_«r.name» : std_logic;
		    «ENDFOR»
		  end record Block_«c.name»_«b.name»_Selection;

		  «ENDFOR»
		  type Comp_«c.name»_Selection is record
		    «FOR b:c.blocks»
		    Block_«b.name» : Block_«c.name»_«b.name»_Selection;
		    «ENDFOR»
		    UnmappedSelection : std_logic;
		    «FOR i:c.insts»
		 «"    "»Selected_«i.name» : std_logic;
		    «ENDFOR»
		  end record Comp_«c.name»_Selection;

		  «ENDFOR»
		end package «id»_pck;
		
		«FOR c:vhdlComps»
		library IEEE;
		use IEEE.STD_LOGIC_1164.ALL;

		entity «id»_Decoder_«c.name» is
		  Port (
		    addr  : in std_logic_vector( «c.addrIdxHi» downto 0 );
		    cycle : in std_logic;
		    selection : out work.«id»_pck.Comp_«c.name»_Selection );
		end «id»_Decoder_«c.name»;
		
		architecture Behavioral of «id»_Decoder_«c.name» is
		  signal res : work.«id»_pck.Comp_«c.name»_Selection;
		begin
		  selection <= res;
		  res.UnmappedSelection <= '1' when
		    «FOR i:c.insts»
		    res.Selected_«i.name» = '0' and
		    «ENDFOR»
		    cycle = '1' else '0';
		  «FOR b:c.blocks»
		  «FOR r:b.registers»
		  res.Block_«b.name».Selected_«r.name» <= '1' when
		    «IF(b.addrIdxHi >= b.addrIdxLo)»
		    addr( «b.addrIdxHi» downto «b.addrIdxLo» ) = "«r.addrBits»" and
		    «ENDIF»
		    cycle = '1' else '0';
		  «ENDFOR»
		  res.Block_«b.name».UnmappedSelection <= '1' when
		    «FOR r:b.registers»
		    res.Block_«b.name».Selected_«r.name» = '0' and
		    «ENDFOR»
		    cycle = '1' else '0';
		  «ENDFOR»
		  «FOR i:c.insts»
		  res.Selected_«i.name» <= '1' when
		    addr( «i.addrIdxHi» downto «i.addrIdxLo» ) = "«i.addrBits»" and
		    cycle = '1' else '0';
		  «ENDFOR»
		end Behavioral;
		«ENDFOR»
		''');
	}
}
