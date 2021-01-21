package concurrent;

/**
 * 1.0v created by wujf on 2021-1-21
 */
class SynConstructor implements HasID{
  private final int id;
  private static Object constructorLock = new Object();

  SynConstructor(SharedArg sa){
    synchronized (constructorLock){
      id = sa.get();
    }
  }

  @Override
  public int getID() {
    return id;
  }
}
public class SynchronizedConstructor {
  public static void main(String[] args) {
    Unsafe unsafe = new Unsafe();
    IDChecker.test(()->new SynConstructor(unsafe));
  }
}
