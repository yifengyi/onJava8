package annotations;

import onjava.atunit.AtUnit;
import onjava.atunit.Test;
import onjava.atunit.TestObjectCreate;

/**
 * 1.0v created by wujf on 2021-1-20
 */
public class AtUnitExample3 {
  private int n;
  public AtUnitExample3(int n) { this.n = n; }
  public int getN() { return n; }
  public String methodOne() {
    return "This is methodOne";
  }
  public int methodTwo() {
    System.out.println("This is methodTwo");
    return 2;
  }
  @TestObjectCreate
  static AtUnitExample3 create() {
    return new AtUnitExample3(47);
  }
  @Test
  boolean initialization() { return n == 47; }
  @Test
  boolean methodOneTest() {
    return methodOne().equals("This is methodOne");
  }
  @Test
  boolean m2() { return methodTwo() == 2; }

  //param target\classes\annotations\AtUnitExample1
  public static void main(String[] args) {
    AtUnit.main(args);
  }
}
