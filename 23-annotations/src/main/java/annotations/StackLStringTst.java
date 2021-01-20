package annotations;

import onjava.atunit.AtUnit;
import onjava.atunit.Test;

/**
 * 1.0v created by wujf on 2021-1-20
 */
public class StackLStringTst extends StackL<String> {
  @Test
  void tPush() {
    push("one");
    assert top().equals("one");
    push("two");
    assert top().equals("two");
  }
  @Test
  void tPop() {
    push("one");
    push("two");
    assert pop().equals("two");
    assert pop().equals("one");
  }
  @Test
  void tTop() {
    push("A");
    push("B");
    assert top().equals("B");
    assert top().equals("B");
  }

  //param target\classes\annotations\AtUnitExample1
  public static void main(String[] args) {
    AtUnit.main(args);
  }
}
