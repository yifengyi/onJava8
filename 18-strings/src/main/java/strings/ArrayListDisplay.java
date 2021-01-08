package strings;

import generics.coffee.Coffee;
import generics.coffee.CoffeeSupplier;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1.0v created by wujf on 2021-1-8
 */
public class ArrayListDisplay {
  public static void main(String[] args) {
    List<Coffee> coffees =
            Stream.generate(new CoffeeSupplier())
            .limit(10)
            .collect(Collectors.toList());
    System.out.println(coffees);
  }
}
