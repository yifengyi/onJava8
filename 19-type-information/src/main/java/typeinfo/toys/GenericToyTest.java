package typeinfo.toys;

/**
 * 1.0v created by wujf on 2021-1-11
 */
public class GenericToyTest {
  public static void main(String[] args) throws IllegalAccessException, InstantiationException {
    Class<FancyToy> ftClass = FancyToy.class;
    FancyToy fancyToy = ftClass.newInstance();

    Class<? super FancyToy> up =
            ftClass.getSuperclass();
    // Class<Toy> up2 = ftClass.getSuperclass();
    Object obj = up.newInstance();
  }
}
