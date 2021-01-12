package generics;

import java.util.List;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class SuperTypeWildcards {
  static void writeTo(List<? super Apple> apples) {
    apples.add(new Apple());
    apples.add(new Jonathan());
    // apples.add(new Fruit()); // Error
  }
}
