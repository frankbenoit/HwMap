package org.chabu.hwmap;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class CommonValueConverter extends DefaultTerminalConverters {
  private final IValueConverter<Integer> intValueConverter = new IValueConverter<Integer>() {
    @Override
    public Integer toValue(final String stringInput, final INode node) throws ValueConverterException {
      String string = stringInput;
      boolean _isEmpty = Strings.isEmpty(string);
      if (_isEmpty) {
        throw new ValueConverterException("Couldn\'t convert empty string to int", node, null);
      }
      try {
        return Integer.decode(string);
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          final NumberFormatException e = (NumberFormatException)_t;
          throw new ValueConverterException((("\'" + string) + "\' is not a valid integer"), node, e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    
    @Override
    public String toString(final Integer value) throws ValueConverterException {
      return Integer.toString((value).intValue());
    }
  };
  
  @ValueConverter(rule = "IntegerLiteral")
  public IValueConverter<Integer> AnyIntegerLiteral() {
    return this.intValueConverter;
  }
}
