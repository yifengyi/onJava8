package concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 1.0v created by wujf on 2021-1-21
 */
interface SharedArg{
  int get();
}
class Unsafe implements SharedArg{
  private int i = 0;
  @Override
  public int get() {
    return i++;
  }
}
class Safe implements SharedArg{
  private static AtomicInteger couner = new AtomicInteger();

  @Override
  public int get() {
    return couner.getAndIncrement();
  }
}
class SharedUser implements HasID{
  private final int id;

  public SharedUser(SharedArg sa) {
    this.id = sa.get();
  }

  @Override
  public int getID() {
    return id;
  }
}
public class SharedConstructionArgument {
  public static void main(String[] args) {
    Unsafe unsafe = new Unsafe();
    IDChecker.test(() -> new SharedUser(unsafe));

    Safe safe = new Safe();
    IDChecker.test(()->new SharedUser(safe));
  }
}
