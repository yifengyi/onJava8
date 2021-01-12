package generics;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class CountedObject {
  private static long counter = 0;
  private final long id = counter++;

  public long id(){
    return id;
  }

  @Override
  public String toString() {
    return "CountedObject " + id;
  }
}
