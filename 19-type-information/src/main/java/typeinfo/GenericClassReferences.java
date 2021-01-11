package typeinfo;

/**
 * 1.0v created by wujf on 2021-1-11
 */
public class GenericClassReferences {
  public static void main(String[] args) {
    Class intClass = int.class;
    Class<Integer> genericIntClass = int.class;
    genericIntClass = Integer.class;
    intClass = double.class;

  }
}
