package concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class GuardedIDField implements HasID {
  private static AtomicInteger counter = new AtomicInteger();
  private int id = counter.getAndIncrement();

  @Override
  public int getID() {
    return id;
  }

  public static void main(String[] args) {
    IDChecker.test(GuardedIDField::new);
  }
}
