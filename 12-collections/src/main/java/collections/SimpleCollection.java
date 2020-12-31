package collections;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public class SimpleCollection {
  public static void main(String[] args) {
    Collection<Integer> c = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      c.add(i);
    }
    for (Integer i : c) {
      System.out.print(i + ", ");
    }
  }
}
