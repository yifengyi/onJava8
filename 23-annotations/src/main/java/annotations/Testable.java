package annotations;

import onjava.atunit.Test;

/**
 * 1.0v created by wujf on 2021-1-19
 */
public class Testable {
  public void execute(){
    System.out.println("Executing..");
  }

  @Test
  void testExecute(){
    execute();
  }
}
