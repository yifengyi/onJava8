package interfaceprocessor;

import java.util.Arrays;

/**
 * 1.0v created by wujf on 2020-12-29
 */

public interface StringProcessor extends Processor {
  @Override
  Object process(Object input);

  String s = "If she weighs the same as a duck, she's made of wood";

  static void main(String[] args) {
    Applicator.apply(new Upcase(),s);
    Applicator.apply(new Downcase(),s);
    Applicator.apply(new Splitter(),s);
  }
}
class  Upcase implements StringProcessor{
  @Override
  public String process(Object input) {
    return ((String) input).toUpperCase();
  }
}
class Downcase implements StringProcessor{
  @Override
  public String process(Object input) {
    return ((String) input).toLowerCase();
  }
}
class Splitter implements StringProcessor{
  @Override
  public String process(Object input) {
    return Arrays.toString(((String) input).split(" "));
  }
}