package org.chabu.hwmap

import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.conversion.ValueConverter

class CommonValueConverter extends DefaultTerminalConverters {
	val intValueConverter = new IValueConverter<Integer>() {
        override Integer toValue(String stringInput, INode node) throws ValueConverterException {
        	var string = stringInput;
            if (Strings.isEmpty(string)) {
                throw new ValueConverterException("Couldn't convert empty string to int", node, null);
            }
            try {
                return Integer.decode(string);
            } catch (NumberFormatException e) {
                throw new ValueConverterException("'"+string+"' is not a valid integer", node, e);
            }
        }
        override String toString(Integer value) throws ValueConverterException {
            return Integer.toString(value);
        }
    };

    @ValueConverter(rule = "IntegerLiteral")
    def IValueConverter<Integer> AnyIntegerLiteral() {
        return intValueConverter;
    }
}