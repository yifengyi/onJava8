package collections;

import java.util.ArrayList;

/**
 * 1.0v created by wujf on 2020-12-31
 */
class Apple {
  private static long counter;
  private final long id = counter++;
  public long id(){
    return id;
  }
}
class Orange{}
public class ApplesAndOrangesWithoutGenerics {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    ArrayList apples = new ArrayList();
    for (int i = 0; i < 3; i++) {
      apples.add(new Apple());
    }
    apples.add(new Orange());
    for (Object apple : apples) {
      ((Apple) apple).id();
    }
    //java.lang.ClassCastException: collections.Orange cannot be cast to collections.Apple

  }
}
