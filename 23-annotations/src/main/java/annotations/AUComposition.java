package annotations;

import onjava.atunit.AtUnit;
import onjava.atunit.Test;

/**
 * 1.0v created by wujf on 2021-1-20
 */
public class AUComposition {
  AtUnitExample1 testObject = new AtUnitExample1();

  @Test
  boolean tMethodOne(){
    return testObject.methodOne().equals("This is methodOne");
  }
  @Test
  boolean tMethodTwo() {
    return testObject.methodTwo() == 2;
  }

  public static void main(String[] args) {
    AtUnit.main(args);
  }
}
