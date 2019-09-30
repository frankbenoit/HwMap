/*
 * generated by Xtext 2.19.0
 */
package org.chabu.hwmap.tests

import com.google.inject.Inject
import org.chabu.hwmap.hwMapDsl.MemoryMap
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(HwMapDslInjectorProvider)
class HwMapDslValidationTest {
	@Inject
	ParseHelper<MemoryMap> parseHelper
	
	@Inject
	IGenerator2 generator
	
	InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();

	@Test
	def void blockSizeAligned() {
		val result = parseNoErrors('''
			Component CapSim {
				Block Regs 0x21 {
				}
			}
		''')
		generateWithErrorContaining( result, "Block Regs has non-aligned size" )
	}
	
	@Test
	def void blockSizePower2() {
		val result = parseNoErrors('''
			Component CapSim {
				Block Regs 0x30 {
				}
			}
		''')
		generateWithErrorContaining( result, "Block Regs has non-power-2 size" )
	}
	
	@Test
	def void instOffsetAligned() {
		val result = parseNoErrors('''
			Component CapSim {
				Block Regs 0x20 {
				}
				0x003 Regs Regs
			}
		''')
		generateWithErrorContaining( result, "Instance Regs has non-aligned offset" )
	}
	
	@Test
	def void instCannotResolveBlock() {
		val result = parseNoErrors('''
			Component CapSim {
				Block Regs 0x20 {
				}
				0x0 Rock Regs
			}
		''')
		generateWithErrorContaining( result, "Block instance type CapSim Rock cannot be resolved" )
	}
	
	@Test
	def void instOffsetIncreasing() {
		val result = parseNoErrors('''
			Component CapSim {
				Block Regs 0x20 {
				}
				0x000 Regs Regs
				0x01C Regs Regs
			}
		''')
		generateWithErrorContaining( result, "Instance Regs has no increasing offset" )
	}
	
	@Test
	def void instOffsetBinaryAligned() {
		val result = parseNoErrors('''
			Component CapSim {
				Block Regs 0x20 {
				}
				0x010 Regs Regs
			}
		''')
		generateWithErrorContaining( result, "is not multiple of block size" )
	}
	
	@Test
	def void registerOffsetAligned() {
		val result = parseNoErrors('''
			Component CapSim {
				Block Regs 0x20 {
					0x03 Control
				}
			}
		''')
		generateWithErrorContaining( result, "Register Control has offset of 3. Must be multiple of 4" )
	}
	
	@Test
	def void registerOffsetIncreasing() {
		val result = parseNoErrors('''
			Component CapSim {
				Block Regs 0x20 {
					0x04 Control
					0x04 Control2
				}
			}
		''')
		generateWithErrorContaining( result, "Registers Control2 must have increasing offset" )
	}
	
	@Test
	def void registerFitsInBlock() {
		val result = parseNoErrors('''
			Component CapSim {
				Block Regs 0x20 {
					0x20 Control2
				}
			}
		''')
		generateWithErrorContaining( result, "Registers Control2 does not fit into block Regs with size 0x20" )
	}
	
	@Test
	def void bitsPosSingleNegative() {
		val result = parseNoErrors('''
			Component CapSim {
				Block Regs 0x20 {
					0x04 Control
						[-1] IRQ
				}
			}
		''')
		generateWithErrorContaining( result, "Registers Control bits IRQ low bit is negative" )
	}
	
	@Test
	def void bitsPosSingleTooBig() {
		val result = parseNoErrors('''
			Component CapSim {
				Block Regs 0x20 {
					0x04 Control
						[32] IRQ
				}
			}
		''')
		generateWithErrorContaining( result, "Registers Control bits IRQ high bit is >31" )
	}
	
	@Test
	def void bitsPosRangeTooBig() {
		val result = parseNoErrors('''
			Component CapSim {
				Block Regs 0x20 {
					0x04 Control
						[32..0] IRQ
				}
			}
		''')
		generateWithErrorContaining( result, "Registers Control bits IRQ high bit is >31" )
	}
	
	@Test
	def void bitsPosRangeInvalid() {
		val result = parseNoErrors('''
			Component CapSim {
				Block Regs 0x20 {
					0x04 Control
						[7..12] IRQ
				}
			}
		''')
		generateWithErrorContaining( result, "Registers Control bits IRQ low bit > high bit" )
	}
	
	@Test
	def void outputModeInvalid() {
		val result = parseNoErrors('''
			Output D "one"
			Component CapSim {
			}
		''')
		generateWithErrorContaining( result, "Unknown output mode D" )
	}
	
	def MemoryMap parseNoErrors(CharSequence text){
		val result = parseHelper.parse(text);
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		return result;		
	}	
	
	def generateWithErrorContaining(MemoryMap result, String expectedError) {
		generator.doGenerate( result.eResource, fsa, null );
		assertHasErrorContaining(result, expectedError)		
	}
	
	def assertHasErrorContaining(MemoryMap result, String text) {
		val errors = result.eResource.errors
		Assertions.assertEquals(1, errors.size(), '''Unexpected errors: «errors.join(", ")»''')
		Assertions.assertTrue( errors.get(0).message.contains(text), '''Unexpected errors: «errors.join(", ")»''')
	}

	def assertNoErrors(MemoryMap result) {
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}

}
