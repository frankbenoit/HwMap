/*
 * generated by Xtext 2.19.0
 */
package org.chabu.hwmap.tests

import com.google.inject.Inject
import java.nio.file.Paths
import org.chabu.hwmap.hwMapDsl.HwMapDslPackage
import org.chabu.hwmap.hwMapDsl.MemoryMap
import org.chabu.hwmap.validation.HwMapDslValidator
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.diagnostics.Diagnostic
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static org.junit.Assert.assertTrue

@ExtendWith(InjectionExtension)
@InjectWith(HwMapDslInjectorProvider)
class HwMapDslValidationTest {
	@Inject
	extension ParseHelper<MemoryMap> parseHelper
	
	@Inject
	extension ValidationTestHelper validationHelper
	
	@Test
	def void blockSizeAligned() {
		parseWithValidationIssue('''
			Component CapSim 0x400 {
				Block Regs 0x21 {
				}
			}
		''',
		HwMapDslPackage.Literals.BLOCK,
		HwMapDslValidator.RANGE_LENGTH_ALIGN,
		"Block Regs has non-aligned size" )
	}
	
	@Test
	def void compSizeAligned() {
		parseWithValidationIssue('''
			Component CapSim 0x401 {
				Block Regs 0x20 {
				}
			}
		''',
		HwMapDslPackage.Literals.COMPONENT,
		HwMapDslValidator.RANGE_LENGTH_ALIGN,
		"Component CapSim has non-aligned size" )
	}
	
	@Test
	def void compSizePower2() {
		parseWithValidationIssue('''
			Component CapSim 0x300 {
			}
		''',
		HwMapDslPackage.Literals.COMPONENT,
		HwMapDslValidator.RANGE_LENGTH_POW2,
		"Component CapSim has non-power-2 size" )
	}
	
	@Test
	def void blockSizePower2() {
		parseWithValidationIssue('''
			Component CapSim 0x400 {
				Block Regs 0x30 {
				}
			}
		''',
		HwMapDslPackage.Literals.BLOCK,
		HwMapDslValidator.RANGE_LENGTH_POW2,
		"Block Regs has non-power-2 size" )
	}
	
	@Test
	def void instOffsetAligned() {
		parseWithValidationIssue('''
			Component CapSim 0x400 {
				Block Regs 0x20 {
				}
				0x003 Regs Regs
			}
		''',
		HwMapDslPackage.Literals.INSTANTIATION,
		HwMapDslValidator.RANGE_LENGTH_ALIGN,
		"Instance Regs has non-aligned offset" )
	}
	
	@Test
	def void instCannotResolveBlock() {
		parseWithValidationIssue('''
			Component CapSim 0x400 {
				Block Regs 0x20 {
				}
				0x0 Rock Regs
			}
		''',
		HwMapDslPackage.Literals.INSTANTIATION,
		Diagnostic.LINKING_DIAGNOSTIC,
		"Couldn't resolve reference to Block 'Rock'." )
	}
	
	@Test
	def void instOffsetIncreasing() {
		parseWithValidationIssue('''
			Component CapSim 0x400 {
				Block Regs 0x20 {
				}
				0x000 Regs Regs1
				0x01C Regs Regs2
			}
		''',
		HwMapDslPackage.Literals.INSTANTIATION,
		HwMapDslValidator.ADDR_OFFSET_INCREASING,
		"Instance Regs2 has no increasing offset" )
	}
	
	@Test
	def void instOffsetBinaryAligned() {
		parseWithValidationIssue('''
			Component CapSim 0x400 {
				Block Regs 0x20 {
				}
				0x010 Regs Regs
			}
		''',
		HwMapDslPackage.Literals.INSTANTIATION,
		HwMapDslValidator.ADDR_OFFSET,
		"is not multiple of block size" )
	}
	
	
	@Test
	def void registerOffsetAligned() {
		parseWithValidationIssue('''
			Component CapSim 0x400 {
				Block Regs 0x20 {
					0x03 Control
				}
			}
		''',
		HwMapDslPackage.Literals.REGISTER,
		HwMapDslValidator.ADDR_OFFSET_ALIGNED,
		"Register Control has offset of 3. Must be multiple of 4" )
	}
	
	@Test
	def void registerOffsetIncreasing() {
		parseWithValidationIssue('''
			Component CapSim 0x400 {
				Block Regs 0x20 {
					0x04 Control
					0x04 Control2
				}
			}
		''',
		HwMapDslPackage.Literals.REGISTER,
		HwMapDslValidator.ADDR_OFFSET_INCREASING,
		"Registers Control2 must have increasing offset" )
	}
	
	@Test
	def void registerFitsInBlock() {
		parseWithValidationIssue('''
			Component CapSim 0x400 {
				Block Regs 0x20 {
					0x20 Control2
				}
			}
		''',
		HwMapDslPackage.Literals.REGISTER,
		HwMapDslValidator.REGISTER_FITS,
		"Registers Control2 does not fit into block Regs with size 0x20" )
	}
	
	@Test
	def void bitsPosSingleNegative() {
		parseWithValidationIssue('''
			Component CapSim 0x400 {
				Block Regs 0x20 {
					0x04 Control
						[-1] IRQ
				}
			}
		''',
		HwMapDslPackage.Literals.REGISTER_BITS,
		HwMapDslValidator.BITS_RANGE_LOW,
		"Registers Control bits IRQ low bit is negative" )
	}
	
	@Test
	def void bitsPosSingleTooBig() {
		parseWithValidationIssue('''
			Component CapSim 0x400 {
				Block Regs 0x20 {
					0x04 Control
						[32] IRQ
				}
			}
		''',
		HwMapDslPackage.Literals.REGISTER_BITS,
		HwMapDslValidator.BITS_RANGE_HIGH,
		"Registers Control bits IRQ high bit is >31" )
	}
	
	@Test
	def void bitsPosRangeTooBig() {
		parseWithValidationIssue('''
			Component CapSim 0x400 {
				Block Regs 0x20 {
					0x04 Control
						[32..0] IRQ
				}
			}
		''',
		HwMapDslPackage.Literals.REGISTER_BITS,
		HwMapDslValidator.BITS_RANGE_HIGH,
		"Registers Control bits IRQ high bit is >31" )
	}
	
	@Test
	def void bitsPosRangeInvalid() {
		parseWithValidationIssue('''
			Component CapSim 0x400 {
				Block Regs 0x20 {
					0x04 Control
						[7..12] IRQ
				}
			}
		''',
		HwMapDslPackage.Literals.REGISTER_BITS,
		HwMapDslValidator.BITS_RANGE_ORDER,
		"Registers Control bits IRQ low bit > high bit"	)
	}
	
	@Test
	def void outputModeInvalid() {
		parseWithValidationIssue('''
			Output D "one"
			Component CapSim 0x400 {
			}
		''',
		HwMapDslPackage.Literals.OUTPUT,
		HwMapDslValidator.OUTPUT_MODE_UNKNOWN,
		"Unknown output mode D"	)
	}
	
	@Test
	def void outputAbsolutePathNotAllowed() {
		parseWithValidationIssue('''
			Output C "c:\\one"
			Component CapSim 0x400 {
			}
		''',
		HwMapDslPackage.Literals.OUTPUT,
		HwMapDslValidator.OUTPUT_PATH_ABSOLUTE,
		"Output path must be a relative path" )
	}
	
	@Test
	def void pathProperties() {
		// path is only absolute on windows when it has a drive letter
		// a path starting with \ is not absolute (still relative to actual drive), but Path has root == null
		assertTrue( !Paths.get("..\\file").isAbsolute );
		assertTrue( !Paths.get("\\file").isAbsolute );
		assertTrue( Paths.get("c:\\file").isAbsolute );
		Assertions.assertNull( Paths.get("..\\file").root );
		Assertions.assertNotNull( Paths.get("c:\\file").root );
		Assertions.assertNotNull( Paths.get("\\file").root );
		//assertTrue( Paths.get("\\file") );
	}
	
	@Test
	def void outputAbsolutePath2NotAllowed() {
		parseWithValidationIssue('''
			Output C "\\one"
			Component CapSim 0x400 {
			}
		''',
		HwMapDslPackage.Literals.OUTPUT,
		HwMapDslValidator.OUTPUT_PATH_ABSOLUTE,
		"Output path must be a relative path"	)
	}
	
	def MemoryMap parseNoErrors(CharSequence text){
		val result = parse(text);
		result.assertNoErrors
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		val res2 = result.validate
		Assertions.assertTrue(res2.isEmpty, '''Unexpected errors: «res2.join(", ")»''')
		return result;		
	}	
	
	def parseWithValidationIssue(CharSequence text, EClass objectType, String code,
			String... messageParts){
		val result = parseWithoutValidation(text)
		result.validate
		result.assertError( objectType, code, messageParts )
	}	
	
	def MemoryMap parseWithoutValidation(CharSequence text){
		val result = parse(text);
		result.assertNoErrors
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		return result;		
	}	
	
	def assertHasErrorContaining(MemoryMap result, String text) {
		val errors = result.eResource.errors
		Assertions.assertEquals(1, errors.size(), '''Unexpected count 1 vs actual «errors.size()», errors: «errors.join(", ")»''')
		Assertions.assertTrue( errors.get(0).message.contains(text), '''Unexpected errors: «errors.join(", ")» is not containing «text»''')
	}

	def assertNoErrors(MemoryMap result) {
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}

}
