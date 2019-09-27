/*
 * generated by Xtext 2.19.0
 */
grammar InternalHwMapDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.chabu.hwmap.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.chabu.hwmap.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.chabu.hwmap.services.HwMapDslGrammarAccess;

}
@parser::members {
	private HwMapDslGrammarAccess grammarAccess;

	public void setGrammarAccess(HwMapDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleMemoryMap
entryRuleMemoryMap
:
{ before(grammarAccess.getMemoryMapRule()); }
	 ruleMemoryMap
{ after(grammarAccess.getMemoryMapRule()); } 
	 EOF 
;

// Rule MemoryMap
ruleMemoryMap 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMemoryMapAccess().getGroup()); }
		(rule__MemoryMap__Group__0)
		{ after(grammarAccess.getMemoryMapAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOutput
entryRuleOutput
:
{ before(grammarAccess.getOutputRule()); }
	 ruleOutput
{ after(grammarAccess.getOutputRule()); } 
	 EOF 
;

// Rule Output
ruleOutput 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOutputAccess().getGroup()); }
		(rule__Output__Group__0)
		{ after(grammarAccess.getOutputAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComponent
entryRuleComponent
:
{ before(grammarAccess.getComponentRule()); }
	 ruleComponent
{ after(grammarAccess.getComponentRule()); } 
	 EOF 
;

// Rule Component
ruleComponent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComponentAccess().getGroup()); }
		(rule__Component__Group__0)
		{ after(grammarAccess.getComponentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInstantiation
entryRuleInstantiation
:
{ before(grammarAccess.getInstantiationRule()); }
	 ruleInstantiation
{ after(grammarAccess.getInstantiationRule()); } 
	 EOF 
;

// Rule Instantiation
ruleInstantiation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInstantiationAccess().getGroup()); }
		(rule__Instantiation__Group__0)
		{ after(grammarAccess.getInstantiationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBlock
entryRuleBlock
:
{ before(grammarAccess.getBlockRule()); }
	 ruleBlock
{ after(grammarAccess.getBlockRule()); } 
	 EOF 
;

// Rule Block
ruleBlock 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBlockAccess().getGroup()); }
		(rule__Block__Group__0)
		{ after(grammarAccess.getBlockAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRegister
entryRuleRegister
:
{ before(grammarAccess.getRegisterRule()); }
	 ruleRegister
{ after(grammarAccess.getRegisterRule()); } 
	 EOF 
;

// Rule Register
ruleRegister 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRegisterAccess().getGroup()); }
		(rule__Register__Group__0)
		{ after(grammarAccess.getRegisterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRegisterBits
entryRuleRegisterBits
:
{ before(grammarAccess.getRegisterBitsRule()); }
	 ruleRegisterBits
{ after(grammarAccess.getRegisterBitsRule()); } 
	 EOF 
;

// Rule RegisterBits
ruleRegisterBits 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRegisterBitsAccess().getGroup()); }
		(rule__RegisterBits__Group__0)
		{ after(grammarAccess.getRegisterBitsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRange
entryRuleRange
:
{ before(grammarAccess.getRangeRule()); }
	 ruleRange
{ after(grammarAccess.getRangeRule()); } 
	 EOF 
;

// Rule Range
ruleRange 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRangeAccess().getGroup()); }
		(rule__Range__Group__0)
		{ after(grammarAccess.getRangeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConstant
entryRuleConstant
:
{ before(grammarAccess.getConstantRule()); }
	 ruleConstant
{ after(grammarAccess.getConstantRule()); } 
	 EOF 
;

// Rule Constant
ruleConstant 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConstantAccess().getGroup()); }
		(rule__Constant__Group__0)
		{ after(grammarAccess.getConstantAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerLiteral
entryRuleIntegerLiteral
:
{ before(grammarAccess.getIntegerLiteralRule()); }
	 ruleIntegerLiteral
{ after(grammarAccess.getIntegerLiteralRule()); } 
	 EOF 
;

// Rule IntegerLiteral
ruleIntegerLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerLiteralAccess().getAlternatives()); }
		(rule__IntegerLiteral__Alternatives)
		{ after(grammarAccess.getIntegerLiteralAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__ModeAlternatives_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOutputAccess().getModeVHDLKeyword_2_0_0()); }
		'VHDL'
		{ after(grammarAccess.getOutputAccess().getModeVHDLKeyword_2_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getOutputAccess().getModeCKeyword_2_0_1()); }
		'C'
		{ after(grammarAccess.getOutputAccess().getModeCKeyword_2_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentAccess().getBlocksAssignment_4_0()); }
		(rule__Component__BlocksAssignment_4_0)
		{ after(grammarAccess.getComponentAccess().getBlocksAssignment_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getComponentAccess().getInstsAssignment_4_1()); }
		(rule__Component__InstsAssignment_4_1)
		{ after(grammarAccess.getComponentAccess().getInstsAssignment_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerLiteralAccess().getINT_DECTerminalRuleCall_0()); }
		RULE_INT_DEC
		{ after(grammarAccess.getIntegerLiteralAccess().getINT_DECTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getIntegerLiteralAccess().getINT_HEXTerminalRuleCall_1()); }
		RULE_INT_HEX
		{ after(grammarAccess.getIntegerLiteralAccess().getINT_HEXTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemoryMap__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemoryMap__Group__0__Impl
	rule__MemoryMap__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MemoryMap__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemoryMapAccess().getMemoryMapAction_0()); }
	()
	{ after(grammarAccess.getMemoryMapAccess().getMemoryMapAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemoryMap__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemoryMap__Group__1__Impl
	rule__MemoryMap__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MemoryMap__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemoryMapAccess().getOutputsAssignment_1()); }
	(rule__MemoryMap__OutputsAssignment_1)*
	{ after(grammarAccess.getMemoryMapAccess().getOutputsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemoryMap__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemoryMap__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MemoryMap__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemoryMapAccess().getComponentsAssignment_2()); }
	(rule__MemoryMap__ComponentsAssignment_2)
	{ after(grammarAccess.getMemoryMapAccess().getComponentsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Output__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Output__Group__0__Impl
	rule__Output__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputAccess().getOutputAction_0()); }
	()
	{ after(grammarAccess.getOutputAccess().getOutputAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Output__Group__1__Impl
	rule__Output__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputAccess().getOutputKeyword_1()); }
	'Output'
	{ after(grammarAccess.getOutputAccess().getOutputKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Output__Group__2__Impl
	rule__Output__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputAccess().getModeAssignment_2()); }
	(rule__Output__ModeAssignment_2)
	{ after(grammarAccess.getOutputAccess().getModeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Output__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOutputAccess().getPathAssignment_3()); }
	(rule__Output__PathAssignment_3)
	{ after(grammarAccess.getOutputAccess().getPathAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__0__Impl
	rule__Component__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getComponentAction_0()); }
	()
	{ after(grammarAccess.getComponentAccess().getComponentAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__1__Impl
	rule__Component__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getComponentKeyword_1()); }
	'Component'
	{ after(grammarAccess.getComponentAccess().getComponentKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__2__Impl
	rule__Component__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getCompNameAssignment_2()); }
	(rule__Component__CompNameAssignment_2)
	{ after(grammarAccess.getComponentAccess().getCompNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__3__Impl
	rule__Component__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__4__Impl
	rule__Component__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getAlternatives_4()); }
	(rule__Component__Alternatives_4)*
	{ after(grammarAccess.getComponentAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Component__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Instantiation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instantiation__Group__0__Impl
	rule__Instantiation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Instantiation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstantiationAccess().getInstantiationAction_0()); }
	()
	{ after(grammarAccess.getInstantiationAccess().getInstantiationAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instantiation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instantiation__Group__1__Impl
	rule__Instantiation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Instantiation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstantiationAccess().getAddrAssignment_1()); }
	(rule__Instantiation__AddrAssignment_1)
	{ after(grammarAccess.getInstantiationAccess().getAddrAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instantiation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instantiation__Group__2__Impl
	rule__Instantiation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Instantiation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstantiationAccess().getTypeAssignment_2()); }
	(rule__Instantiation__TypeAssignment_2)
	{ after(grammarAccess.getInstantiationAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instantiation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instantiation__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Instantiation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstantiationAccess().getNameAssignment_3()); }
	(rule__Instantiation__NameAssignment_3)?
	{ after(grammarAccess.getInstantiationAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Block__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Block__Group__0__Impl
	rule__Block__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Block__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockAccess().getBlockAction_0()); }
	()
	{ after(grammarAccess.getBlockAccess().getBlockAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Block__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Block__Group__1__Impl
	rule__Block__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Block__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockAccess().getBlockKeyword_1()); }
	'Block'
	{ after(grammarAccess.getBlockAccess().getBlockKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Block__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Block__Group__2__Impl
	rule__Block__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Block__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockAccess().getNameAssignment_2()); }
	(rule__Block__NameAssignment_2)
	{ after(grammarAccess.getBlockAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Block__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Block__Group__3__Impl
	rule__Block__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Block__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockAccess().getSizeAssignment_3()); }
	(rule__Block__SizeAssignment_3)
	{ after(grammarAccess.getBlockAccess().getSizeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Block__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Block__Group__4__Impl
	rule__Block__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Block__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Block__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Block__Group__5__Impl
	rule__Block__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Block__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockAccess().getRegsAssignment_5()); }
	(rule__Block__RegsAssignment_5)*
	{ after(grammarAccess.getBlockAccess().getRegsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Block__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Block__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Block__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Register__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Register__Group__0__Impl
	rule__Register__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Register__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegisterAccess().getAddrAssignment_0()); }
	(rule__Register__AddrAssignment_0)
	{ after(grammarAccess.getRegisterAccess().getAddrAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Register__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Register__Group__1__Impl
	rule__Register__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Register__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegisterAccess().getNameAssignment_1()); }
	(rule__Register__NameAssignment_1)
	{ after(grammarAccess.getRegisterAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Register__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Register__Group__2__Impl
	rule__Register__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Register__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegisterAccess().getConstsAssignment_2()); }
	(rule__Register__ConstsAssignment_2)*
	{ after(grammarAccess.getRegisterAccess().getConstsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Register__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Register__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Register__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegisterAccess().getBitsAssignment_3()); }
	(rule__Register__BitsAssignment_3)*
	{ after(grammarAccess.getRegisterAccess().getBitsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RegisterBits__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegisterBits__Group__0__Impl
	rule__RegisterBits__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RegisterBits__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegisterBitsAccess().getRangeAssignment_0()); }
	(rule__RegisterBits__RangeAssignment_0)
	{ after(grammarAccess.getRegisterBitsAccess().getRangeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegisterBits__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegisterBits__Group__1__Impl
	rule__RegisterBits__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RegisterBits__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegisterBitsAccess().getNameAssignment_1()); }
	(rule__RegisterBits__NameAssignment_1)
	{ after(grammarAccess.getRegisterBitsAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegisterBits__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RegisterBits__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RegisterBits__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegisterBitsAccess().getConstsAssignment_2()); }
	(rule__RegisterBits__ConstsAssignment_2)*
	{ after(grammarAccess.getRegisterBitsAccess().getConstsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Range__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Range__Group__0__Impl
	rule__Range__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Range__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_0()); }
	'['
	{ after(grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Range__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Range__Group__1__Impl
	rule__Range__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Range__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRangeAccess().getLeftAssignment_1()); }
	(rule__Range__LeftAssignment_1)
	{ after(grammarAccess.getRangeAccess().getLeftAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Range__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Range__Group__2__Impl
	rule__Range__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Range__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRangeAccess().getGroup_2()); }
	(rule__Range__Group_2__0)?
	{ after(grammarAccess.getRangeAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Range__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Range__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Range__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRangeAccess().getRightSquareBracketKeyword_3()); }
	']'
	{ after(grammarAccess.getRangeAccess().getRightSquareBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Range__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Range__Group_2__0__Impl
	rule__Range__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Range__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRangeAccess().getOP_2DOTTerminalRuleCall_2_0()); }
	RULE_OP_2DOT
	{ after(grammarAccess.getRangeAccess().getOP_2DOTTerminalRuleCall_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Range__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Range__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Range__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRangeAccess().getRightAssignment_2_1()); }
	(rule__Range__RightAssignment_2_1)
	{ after(grammarAccess.getRangeAccess().getRightAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Constant__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Constant__Group__0__Impl
	rule__Constant__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Constant__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstantAccess().getConstantKeyword_0()); }
	'Constant'
	{ after(grammarAccess.getConstantAccess().getConstantKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constant__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Constant__Group__1__Impl
	rule__Constant__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Constant__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstantAccess().getValueAssignment_1()); }
	(rule__Constant__ValueAssignment_1)
	{ after(grammarAccess.getConstantAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constant__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Constant__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Constant__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstantAccess().getIDTerminalRuleCall_2()); }
	RULE_ID
	{ after(grammarAccess.getConstantAccess().getIDTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MemoryMap__OutputsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemoryMapAccess().getOutputsOutputParserRuleCall_1_0()); }
		ruleOutput
		{ after(grammarAccess.getMemoryMapAccess().getOutputsOutputParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemoryMap__ComponentsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemoryMapAccess().getComponentsComponentParserRuleCall_2_0()); }
		ruleComponent
		{ after(grammarAccess.getMemoryMapAccess().getComponentsComponentParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__ModeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOutputAccess().getModeAlternatives_2_0()); }
		(rule__Output__ModeAlternatives_2_0)
		{ after(grammarAccess.getOutputAccess().getModeAlternatives_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Output__PathAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOutputAccess().getPathSTRINGTerminalRuleCall_3_0()); }
		RULE_STRING
		{ after(grammarAccess.getOutputAccess().getPathSTRINGTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__CompNameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentAccess().getCompNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getComponentAccess().getCompNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__BlocksAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentAccess().getBlocksBlockParserRuleCall_4_0_0()); }
		ruleBlock
		{ after(grammarAccess.getComponentAccess().getBlocksBlockParserRuleCall_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__InstsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComponentAccess().getInstsInstantiationParserRuleCall_4_1_0()); }
		ruleInstantiation
		{ after(grammarAccess.getComponentAccess().getInstsInstantiationParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instantiation__AddrAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstantiationAccess().getAddrIntegerLiteralParserRuleCall_1_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getInstantiationAccess().getAddrIntegerLiteralParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instantiation__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstantiationAccess().getTypeIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getInstantiationAccess().getTypeIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instantiation__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstantiationAccess().getNameIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getInstantiationAccess().getNameIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Block__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Block__SizeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBlockAccess().getSizeIntegerLiteralParserRuleCall_3_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getBlockAccess().getSizeIntegerLiteralParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Block__RegsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBlockAccess().getRegsRegisterParserRuleCall_5_0()); }
		ruleRegister
		{ after(grammarAccess.getBlockAccess().getRegsRegisterParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Register__AddrAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegisterAccess().getAddrIntegerLiteralParserRuleCall_0_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getRegisterAccess().getAddrIntegerLiteralParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Register__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegisterAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRegisterAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Register__ConstsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegisterAccess().getConstsConstantParserRuleCall_2_0()); }
		ruleConstant
		{ after(grammarAccess.getRegisterAccess().getConstsConstantParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Register__BitsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegisterAccess().getBitsRegisterBitsParserRuleCall_3_0()); }
		ruleRegisterBits
		{ after(grammarAccess.getRegisterAccess().getBitsRegisterBitsParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegisterBits__RangeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegisterBitsAccess().getRangeRangeParserRuleCall_0_0()); }
		ruleRange
		{ after(grammarAccess.getRegisterBitsAccess().getRangeRangeParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegisterBits__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegisterBitsAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRegisterBitsAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RegisterBits__ConstsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegisterBitsAccess().getConstsConstantParserRuleCall_2_0()); }
		ruleConstant
		{ after(grammarAccess.getRegisterBitsAccess().getConstsConstantParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Range__LeftAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRangeAccess().getLeftIntegerLiteralParserRuleCall_1_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getRangeAccess().getLeftIntegerLiteralParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Range__RightAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRangeAccess().getRightIntegerLiteralParserRuleCall_2_1_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getRangeAccess().getRightIntegerLiteralParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constant__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstantAccess().getValueIntegerLiteralParserRuleCall_1_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getConstantAccess().getValueIntegerLiteralParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_INT_DEC : ('-'? '1'..'9' ('0'..'9')*|'0');

RULE_INT_HEX : '0x' ('a'..'f'|'A'..'F'|'0'..'9')+;

RULE_OP_2DOT : '..';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
