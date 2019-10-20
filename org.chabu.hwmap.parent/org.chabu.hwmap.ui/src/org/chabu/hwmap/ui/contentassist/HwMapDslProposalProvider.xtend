/*
 * generated by Xtext 2.19.0
 */
package org.chabu.hwmap.ui.contentassist

import org.chabu.hwmap.hwMapDsl.Component
import org.chabu.hwmap.hwMapDsl.Instantiation
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class HwMapDslProposalProvider extends AbstractHwMapDslProposalProvider {
	
	override completeOutput_Mode(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeOutput_Mode(model, assignment, context, acceptor)
		acceptor.accept(createCompletionProposal("C", context ))
		acceptor.accept(createCompletionProposal("VHDL", context ))
		System.out.println(">>"+model)
		System.out.println(">>>"+model.class)
	}
	
	override completeInstantiation_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeInstantiation_Type(model, assignment, context, acceptor)
		System.out.println(">>"+model)
		val inst = model as Instantiation
		val comp = inst.eContainer as Component
		comp.blocks
			.map[ b | b.name ]
			.forEach[ n |
				System.out.println("Propose: "+n)
				acceptor.accept(createCompletionProposal(n, context ))
				
			]
	}
	
	override completeInstantiation_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeInstantiation_Name(model, assignment, context, acceptor)
	}
	
//	override complete_Output(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.complete_Output(model, ruleCall, context, acceptor)
//		acceptor.accept(createCompletionProposal("C", context ))
//		acceptor.accept(createCompletionProposal("VHDL", context ))
//	}
}
