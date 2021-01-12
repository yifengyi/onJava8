package generics;

/**
 * 1.0v created by wujf on 2021-1-12
 */
class Bob{}
public class Diamond<T> {
  public static void main(String[] args) {
    GenericHolder<Bob> h3 = new GenericHolder<>();
    h3.set(new Bob());
  }
}
