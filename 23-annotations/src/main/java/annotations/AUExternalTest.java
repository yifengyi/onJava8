package annotations;

import onjava.atunit.AtUnit;
import onjava.atunit.Test;

/**
 * 1.0v created by wujf on 2021-1-20
 */
public class AUExternalTest extends AtUnitExample1 {
  @Test
  boolean _MethodOne(){
    return methodOne().equals("This is methodOne");
  }
  @Test
  boolean _MethodTwo(){
    return methodTwo() == 2;
  }

  //param target\classes\annotations\AUExternalTest
  public static void main(String[] args) {
    AtUnit.main(args);
  }
}
