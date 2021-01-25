package patterns;

/**
 * 单例模式
 * 1.0v created by wujf on 2021-1-21
 */
interface Resource {
  int getValue();

  void setValue(int x);
}
/*
 * 由于这不是从Cloneable基类继承而且没有添加可克隆性，
 * 因此将其设置为final可防止通过继承添加可克隆性。
 * 这也实现了线程安全的延迟初始化：
 */
final class Singleton {
  //私有化Resource 实现类 用以实现单利
  private static final class ResourceImpl implements Resource {
    private int i;

    private ResourceImpl(int i) {
      this.i = i;
    }

    @Override
    public synchronized int getValue() {
      return i;
    }

    @Override
    public synchronized void setValue(int x) {
      i = x;
    }
  }
  private static class ResourceHolder {
    private static Resource resource = new ResourceImpl(47);
  }

  public static Resource getResource(){
    return ResourceHolder.resource;
  }
}

public class SingletonPattern {
  public static void main(String[] args) {
    Resource r = Singleton.getResource();
    System.out.println(r.getValue());
    Resource r2 = Singleton.getResource();
    r2.setValue(9);
    System.out.println(r.getValue());

    try {
      //final 不能clone
      // Singleton s = (Singleton)r2.clone();//
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
