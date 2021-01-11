package typeinfo;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 1.0v created by wujf on 2021-1-11
 */
class CountedInteger {
  private static long counter;
  private final  long id = counter++;

  @Override
  public String toString() {
    return Long.toString(id);
  }
}

public class DynamicSupplier<T> implements Supplier<T> {
  private Class<T> type;

  public DynamicSupplier(Class<T> type) {
    this.type = type;
  }

  @Override
  public T get() {
    try {
      return type.newInstance();
    } catch (InstantiationException
            | IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {
    Stream.generate(
            new DynamicSupplier<>(CountedInteger.class)
    ).skip(10)
            .limit(5)
            .forEach(System.out::println);

  }
}
