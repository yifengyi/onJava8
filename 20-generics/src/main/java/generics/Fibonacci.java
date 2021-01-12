package generics;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class Fibonacci implements Supplier<Integer> {
  private int count = 0;

  @Override
  public Integer get() {
    return fib(count++);
  }

  private int fib(int n) {
    if (2 > n) {
      return 1;
    }
    return fib(n - 2) + fib(n - 1);
  }

  public static void main(String[] args) {
    Stream.generate(new Fibonacci())
            .limit(18)
            .map(n -> n + " ")
            .forEach(System.out::print);
  }
}
