package typeinfo;

/**
 * 1.0v created by wujf on 2021-1-11
 */
public class WildcardClassReferences {
  public static void main(String[] args) {
    Class<?> intClass = int.class;
    intClass = double.class;
  }
}
