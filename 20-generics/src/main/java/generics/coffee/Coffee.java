package generics.coffee;

/**
 * 1.0v created by wujf on 2021-1-8
 */
public class Coffee {
  private static long counter = 0;
  private final long id = counter++;

  @Override
  public String toString() {
    return getClass().getSimpleName() + " " + id;
  }
}
