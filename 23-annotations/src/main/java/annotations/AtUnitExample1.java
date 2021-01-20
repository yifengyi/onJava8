package annotations;

import onjava.atunit.AtUnit;
import onjava.atunit.Test;

/**
 * 1.0v created by wujf on 2021-1-20
 */
public class AtUnitExample1 {
  public String methodOne(){
    return "This is methodOne";
  }
  public int methodTwo(){
    System.out.println("This is methodTwo");
    return 2;
  }

  @Test
  boolean methodOneTest(){
    return methodOne().equals("This is methodOne");
  }
  @Test
  boolean m2(){
    return methodTwo() == 2;
  }
  @Test
  private boolean m3(){
    return true;
  }

  @Test
  boolean failureTest(){
    return false;
  }
  @Test
  boolean anotherDisappointment(){
    return false;
  }
  //param target\classes\annotations\AtUnitExample1
  public static void main(String[] args) {
    AtUnit.main(args);
  }
}
