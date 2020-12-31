package collections;

import java.util.ArrayList;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public class ApplesAndOrangesWithGenerics {
  public static void main(String[] args) {
    ArrayList<Apple> apples = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      apples.add(new Apple());

    }
    // apples.add(new collections.Orange());//
    for (Apple apple : apples) {
      System.out.println(apple.id());
    }
  }
}
