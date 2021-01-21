package concurrent;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class StaticIDField implements HasID {
  private static int counter = 0;
  private int id = counter++;
  @Override
  public int getID() {
    return id;
  }
}
