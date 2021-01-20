package annotations;

import onjava.atunit.AtUnit;
import onjava.atunit.Test;

import java.util.HashSet;

/**
 * 1.0v created by wujf on 2021-1-20
 */
public class HashSetTest {
  HashSet<String> testObject = new HashSet<>();
  @Test
  void initialization() {
    assert testObject.isEmpty();
  }
  @Test
  void _Contains() {
    testObject.add("one");
    assert testObject.contains("one");
  }
  @Test
  void _Remove() {
    testObject.add("one");
    testObject.remove("one");
    assert testObject.isEmpty();
  }

  public static void main(String[] args) {
    AtUnit.main(args);
  }
}
