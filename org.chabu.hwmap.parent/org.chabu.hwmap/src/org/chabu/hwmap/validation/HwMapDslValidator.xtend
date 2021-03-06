/*
 * generated by Xtext 2.19.0
 */
package org.chabu.hwmap.validation

import org.chabu.hwmap.hwMapDsl.Block
import org.chabu.hwmap.hwMapDsl.Component
import org.chabu.hwmap.hwMapDsl.HwMapDslPackage
import org.chabu.hwmap.hwMapDsl.Instantiation
import org.chabu.hwmap.hwMapDsl.Output
import org.chabu.hwmap.hwMapDsl.Register
import org.chabu.hwmap.hwMapDsl.RegisterBits
import org.eclipse.xtext.validation.Check
import java.nio.file.Paths
import nonapi.io.github.classgraph.utils.FileUtils
import com.google.common.io.Files

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class HwMapDslValidator extends AbstractHwMapDslValidator {
	
	static val PREFIX = HwMapDslValidator.name
	static val ALIGN = 4;
	
	public static val RANGE_LENGTH_ALIGN     = PREFIX + 'RANGE_LENGTH_ALIGN'
	public static val RANGE_LENGTH_POW2      = PREFIX + 'RANGE_LENGTH_POW2'
	public static val ADDR_OFFSET            = PREFIX + 'ADDR_OFFSET'
	public static val ADDR_OFFSET_INCREASING = PREFIX + 'ADDR_OFFSET_INCREASING'
	public static val ADDR_OFFSET_ALIGNED    = PREFIX + 'ADDR_OFFSET_ALIGNED'
	public static val REGISTER_FITS          = PREFIX + 'REGISTER_FITS'
	public static val BITS_RANGE_LOW         = PREFIX + 'BITS_RANGE_LOW'
	public static val BITS_RANGE_HIGH        = PREFIX + 'BITS_RANGE_HIGH'
	public static val BITS_RANGE_SIZE        = PREFIX + 'BITS_RANGE_SIZE'
	public static val BITS_RANGE_ORDER       = PREFIX + 'BITS_RANGE_ORDER'
	public static val OUTPUT_PATH_ABSOLUTE   = PREFIX + 'OUTPUT_PATH_ABSOLUTE'
	public static val OUTPUT_PATH_EXTENSION  = PREFIX + 'OUTPUT_PATH_EXTENSION'
	public static val OUTPUT_MODE_UNKNOWN    = PREFIX + 'OUTPUT_MODE_UNKNOWN'
	public static val ID_UNDERSCORE          = PREFIX + 'ID_UNDERSCORE'

	@Check
	def checkOutputMode(Output output) {
		switch(output.mode){
			case "VHDL", case "C": return
			default:
				error('''Unknown output mode «output.mode».''',
					output,
					HwMapDslPackage.Literals.OUTPUT__MODE,
					OUTPUT_MODE_UNKNOWN )
		}
	}
	
	@Check
	def checkOutputPath(Output output) {
		val path = Paths.get(output.path)
		if( path.root !== null ){
			error('''Output path must be a relative path. Not «path»''',
				output,
				HwMapDslPackage.Literals.OUTPUT__PATH,
				OUTPUT_PATH_ABSOLUTE )
		}
		
		val ext = Files.getFileExtension(path.fileName.toString)
		if(output.mode == "VHDL" && ext != 'vhd' ){
			error('Output path must have extension .vhd',
				output,
				HwMapDslPackage.Literals.OUTPUT__PATH,
				OUTPUT_PATH_EXTENSION )
		}
		if( output.mode == "C" && ext != 'h'){
			error('Output path must have extension .h',
				output,
				HwMapDslPackage.Literals.OUTPUT__PATH,
				OUTPUT_PATH_EXTENSION )
		}
	}
	

	@Check
	def checkComponent(Component comp) {
		if( comp.name.startsWith('_') || comp.name.endsWith('_')) {
			error('''Component id «comp.name» cannot have leading or trailing underscores''',
				comp,
				HwMapDslPackage.Literals.COMPONENT__NAME,
				ID_UNDERSCORE )
		}
		if( comp.name.contains('__') ) {
			error('''Component id «comp.name» cannot contain multi underscores''',
				comp,
				HwMapDslPackage.Literals.COMPONENT__NAME,
				ID_UNDERSCORE )
		}
		if( comp.size % org.chabu.hwmap.validation.HwMapDslValidator.ALIGN != 0 ){
			error('''Component «comp.name» has non-aligned size of «comp.size».''',
				comp,
				HwMapDslPackage.Literals.COMPONENT__SIZE,
				RANGE_LENGTH_ALIGN )
		}
		if( Integer::bitCount(comp.size) != 1 ){
			error('''Component «comp.name» has non-power-2 size''',
				comp,
				HwMapDslPackage.Literals.COMPONENT__SIZE,
				RANGE_LENGTH_POW2 )
		}
		
		var nextOffset = 0
		for( Instantiation inst : comp.insts ){
			if( inst.addr < nextOffset ){
				error('''Instance «inst.name» has no increasing offset. Minimum expected offset is «String::format("0x%X", nextOffset)»''',
					inst,
					HwMapDslPackage.Literals.INSTANTIATION__ADDR,
					ADDR_OFFSET_INCREASING )
			}
			nextOffset = inst.addr + inst.type.size
		}
	}
	
	@Check
	def checkBlock(Block block) {
		if( block.name.startsWith('_') || block.name.endsWith('_')) {
			error('''Block id «block.name» cannot have leading or trailing underscores''',
				block,
				HwMapDslPackage.Literals.BLOCK__NAME,
				ID_UNDERSCORE )
		}
		if( block.name.contains('__') ) {
			error('''Block id «block.name» cannot contain multi underscores''',
				block,
				HwMapDslPackage.Literals.BLOCK__NAME,
				ID_UNDERSCORE )
		}
		if( block.size % org.chabu.hwmap.validation.HwMapDslValidator.ALIGN != 0 ){
			error('''Block «block.name» has non-aligned size of «block.size».''',
				block,
				HwMapDslPackage.Literals.BLOCK__SIZE,
				RANGE_LENGTH_ALIGN )
		}
		if( Integer::bitCount(block.size) != 1 ){
			error('''Block «block.name» has non-power-2 size''',
				block,
				HwMapDslPackage.Literals.BLOCK__SIZE,
				RANGE_LENGTH_POW2 )
		}
		
		var nextOffset = 0
		for( Register reg : block.regs ) {
			if( reg.addr < nextOffset ) {
				error('''Registers «reg.name» must have increasing offset to previous register''',
					reg,
					HwMapDslPackage.Literals.REGISTER__ADDR,
					ADDR_OFFSET_INCREASING )
			}
			
			if( reg.addr + org.chabu.hwmap.validation.HwMapDslValidator.ALIGN > block.size ) {
				error('''Registers «reg.name» does not fit into block «block.name» with size «String::format("0x%X", block.size )»''',
					reg,
					HwMapDslPackage.Literals.REGISTER__ADDR,
					REGISTER_FITS )
			}
			nextOffset = reg.addr + org.chabu.hwmap.validation.HwMapDslValidator.ALIGN
		}
	}
	
	@Check
	def checkRegister(Register reg) {
		if( reg.addr % org.chabu.hwmap.validation.HwMapDslValidator.ALIGN != 0 ){
			error('''Register «reg.name» has offset of «reg.addr». Must be multiple of «org.chabu.hwmap.validation.HwMapDslValidator.ALIGN»''',
				reg,
				HwMapDslPackage.Literals.REGISTER__ADDR,
				ADDR_OFFSET_ALIGNED )
		}

		
	}
	
	@Check
	def checkRegisterBits(RegisterBits bits ) {
		val highBit = bits.range.left
		val lowBit = ( bits.range.right !== null ) ? bits.range.right : bits.range.left
		val reg = bits.eContainer as Register;
		val regName = reg.name
		if( lowBit < 0 ){
			error('''Registers «regName» bits «bits.name» low bit is negative''',
				bits,
				HwMapDslPackage.Literals.REGISTER_BITS__RANGE,
				BITS_RANGE_LOW )
			
		}
		if( highBit > 31 ){
			error('''Registers «regName» bits «bits.name» high bit is >31''',
				bits,
				HwMapDslPackage.Literals.REGISTER_BITS__RANGE,
				BITS_RANGE_HIGH )
			
		}
		if( highBit < lowBit ){
			error('''Registers «regName» bits «bits.name» low bit > high bit''',
				bits,
				HwMapDslPackage.Literals.REGISTER_BITS__RANGE,
				BITS_RANGE_ORDER )
			
		}
	}
	
	@Check
	def checkInstantiation(Instantiation inst) {
		val name = inst.name !== null ? inst.name : inst.type.name
		if( name.startsWith('_') || name.endsWith('_')) {
			error('''Instance id «name» cannot have leading or trailing underscores''',
				inst,
				HwMapDslPackage.Literals.INSTANTIATION__NAME,
				ID_UNDERSCORE )
		}
		if( name.contains('__') ) {
			error('''Instance id «name» cannot contain multi underscores''',
				inst,
				HwMapDslPackage.Literals.INSTANTIATION__NAME,
				ID_UNDERSCORE )
		}
		if( inst.addr % org.chabu.hwmap.validation.HwMapDslValidator.ALIGN != 0 ){
			error('''Instance «inst.name» has non-aligned offset of «inst.addr».''',
				inst,
				HwMapDslPackage.Literals.INSTANTIATION__ADDR,
				RANGE_LENGTH_ALIGN )
		}
		if( inst.addr % inst.type.size != 0 ){
			error('''Block instance «inst.name» at address «inst.addr» is not multiple of block size «inst.type.size».''',
				inst,
				HwMapDslPackage.Literals.INSTANTIATION__ADDR,
				ADDR_OFFSET )
		}
	}
	
}
