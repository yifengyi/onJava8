package onjava;

import java.util.function.Supplier;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class BasicSupplier<T> implements Supplier<T> {
  private Class<T> type;

  public BasicSupplier(Class<T> type) {
    this.type = type;
  }


  @Override
  public T get() {
    try {
      return type.newInstance();
    } catch (InstantiationException | IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }
  public static <T> Supplier<T> create(Class<T> type){
    return new BasicSupplier<>(type);
  }
}
