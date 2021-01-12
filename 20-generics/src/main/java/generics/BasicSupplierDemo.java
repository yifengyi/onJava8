package generics;

import onjava.BasicSupplier;

import java.util.stream.Stream;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class BasicSupplierDemo {
  public static void main(String[] args) {
    Stream.generate(
            BasicSupplier.create(CountedObject.class))
            .limit(5)
            .forEach(System.out::println);
  }
}
