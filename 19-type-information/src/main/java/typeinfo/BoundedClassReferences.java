package typeinfo;

/**
 * 1.0v created by wujf on 2021-1-11
 */
public class BoundedClassReferences {
  public static void main(String[] args) {
    Class<? extends Number> bounded = int.class;
    bounded= double.class;
    bounded = Number.class;
  }
}
