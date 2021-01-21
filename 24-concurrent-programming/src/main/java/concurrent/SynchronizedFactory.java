package concurrent;

/**
 * 1.0v created by wujf on 2021-1-21
 */
final class SyncFactory implements HasID {
  private final int id;

  private SyncFactory(SharedArg sa) {
    id = sa.get();
  }

  @Override
  public int getID() {
    return id;
  }

  public static synchronized SyncFactory factory(SharedArg sa) {
    return new SyncFactory(sa);
  }
}

public class SynchronizedFactory {
  public static void main(String[] args) {
    Unsafe unsafe = new Unsafe();
    IDChecker.test(()->SyncFactory.factory(unsafe));
  }
}
