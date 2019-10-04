package org.chabu.hwmap.ui.tests

import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.ui.testing.AbstractContentAssistTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.junit.jupiter.api.Assertions

/**
 * @author Jan Koehnlein - copied and adapted from Xtend
 */
@ExtendWith(InjectionExtension)
@InjectWith(HwMapDslUiInjectorProvider)
class ContentAssistTest extends AbstractContentAssistTest {

	@Test def void testImportCompletion() {
		newBuilder.append('Output ').assertText('C', 'VHDL')
	}

	@Test def void instanceBlockName() {
		val b = newBuilder.append('''
		Component A {
			Block Block1 0x20 {
			}
			Block Block2 0x20 {
			}
			0x000 <|>
		}
		''')
		b.assertProposalAtCursor('Block1')
		b.assertProposalAtCursor('Block2')
		Assertions.assertEquals( 2, b.getProposalsAtCursorIndicator().length, "Proposal count" )
	}

}
