package generics;

import java.util.ArrayList;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class ErasedTypeEquivalence {
  public static void main(String[] args) {
    Class c1 = new ArrayList<String>().getClass();
    Class c2 = new ArrayList<Integer>().getClass();
    System.out.println(c1 == c2);
  }
}
