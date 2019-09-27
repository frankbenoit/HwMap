/*
 * generated by Xtext 2.19.0
 */
package org.chabu.hwmap.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.chabu.hwmap.ide.contentassist.antlr.internal.InternalHwMapDslParser;
import org.chabu.hwmap.services.HwMapDslGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class HwMapDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(HwMapDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, HwMapDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getOutputAccess().getModeAlternatives_2_0(), "rule__Output__ModeAlternatives_2_0");
			builder.put(grammarAccess.getComponentAccess().getAlternatives_4(), "rule__Component__Alternatives_4");
			builder.put(grammarAccess.getIntegerLiteralAccess().getAlternatives(), "rule__IntegerLiteral__Alternatives");
			builder.put(grammarAccess.getMemoryMapAccess().getGroup(), "rule__MemoryMap__Group__0");
			builder.put(grammarAccess.getOutputAccess().getGroup(), "rule__Output__Group__0");
			builder.put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
			builder.put(grammarAccess.getInstantiationAccess().getGroup(), "rule__Instantiation__Group__0");
			builder.put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
			builder.put(grammarAccess.getRegisterAccess().getGroup(), "rule__Register__Group__0");
			builder.put(grammarAccess.getRegisterBitsAccess().getGroup(), "rule__RegisterBits__Group__0");
			builder.put(grammarAccess.getRangeAccess().getGroup(), "rule__Range__Group__0");
			builder.put(grammarAccess.getRangeAccess().getGroup_2(), "rule__Range__Group_2__0");
			builder.put(grammarAccess.getConstantAccess().getGroup(), "rule__Constant__Group__0");
			builder.put(grammarAccess.getMemoryMapAccess().getOutputsAssignment_1(), "rule__MemoryMap__OutputsAssignment_1");
			builder.put(grammarAccess.getMemoryMapAccess().getComponentsAssignment_2(), "rule__MemoryMap__ComponentsAssignment_2");
			builder.put(grammarAccess.getOutputAccess().getModeAssignment_2(), "rule__Output__ModeAssignment_2");
			builder.put(grammarAccess.getOutputAccess().getPathAssignment_3(), "rule__Output__PathAssignment_3");
			builder.put(grammarAccess.getComponentAccess().getCompNameAssignment_2(), "rule__Component__CompNameAssignment_2");
			builder.put(grammarAccess.getComponentAccess().getBlocksAssignment_4_0(), "rule__Component__BlocksAssignment_4_0");
			builder.put(grammarAccess.getComponentAccess().getInstsAssignment_4_1(), "rule__Component__InstsAssignment_4_1");
			builder.put(grammarAccess.getInstantiationAccess().getAddrAssignment_1(), "rule__Instantiation__AddrAssignment_1");
			builder.put(grammarAccess.getInstantiationAccess().getTypeAssignment_2(), "rule__Instantiation__TypeAssignment_2");
			builder.put(grammarAccess.getInstantiationAccess().getNameAssignment_3(), "rule__Instantiation__NameAssignment_3");
			builder.put(grammarAccess.getBlockAccess().getNameAssignment_2(), "rule__Block__NameAssignment_2");
			builder.put(grammarAccess.getBlockAccess().getSizeAssignment_3(), "rule__Block__SizeAssignment_3");
			builder.put(grammarAccess.getBlockAccess().getRegsAssignment_5(), "rule__Block__RegsAssignment_5");
			builder.put(grammarAccess.getRegisterAccess().getAddrAssignment_0(), "rule__Register__AddrAssignment_0");
			builder.put(grammarAccess.getRegisterAccess().getNameAssignment_1(), "rule__Register__NameAssignment_1");
			builder.put(grammarAccess.getRegisterAccess().getConstsAssignment_2(), "rule__Register__ConstsAssignment_2");
			builder.put(grammarAccess.getRegisterAccess().getBitsAssignment_3(), "rule__Register__BitsAssignment_3");
			builder.put(grammarAccess.getRegisterBitsAccess().getRangeAssignment_0(), "rule__RegisterBits__RangeAssignment_0");
			builder.put(grammarAccess.getRegisterBitsAccess().getNameAssignment_1(), "rule__RegisterBits__NameAssignment_1");
			builder.put(grammarAccess.getRegisterBitsAccess().getConstsAssignment_2(), "rule__RegisterBits__ConstsAssignment_2");
			builder.put(grammarAccess.getRangeAccess().getLeftAssignment_1(), "rule__Range__LeftAssignment_1");
			builder.put(grammarAccess.getRangeAccess().getRightAssignment_2_1(), "rule__Range__RightAssignment_2_1");
			builder.put(grammarAccess.getConstantAccess().getValueAssignment_1(), "rule__Constant__ValueAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private HwMapDslGrammarAccess grammarAccess;

	@Override
	protected InternalHwMapDslParser createParser() {
		InternalHwMapDslParser result = new InternalHwMapDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public HwMapDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(HwMapDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
