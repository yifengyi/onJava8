package patterns;

/**
 * 1.0v created by wujf on 2021-1-21
 */
interface Resource {
  int getValue();

  void setValue(int x);
}

final class Singleton {
  private static final class ResourceImpl implements Resource {
    private int i;

    private ResourceImpl(int i) {
      this.i = i;
    }

    @Override
    public int getValue() {
      return i;
    }

    @Override
    public void setValue(int x) {
      i = x;
    }
  }
  private static class ResourceHoler{
    private static Resource resource = new ResourceImpl(47);
  }

  public static Resource getResource(){
    return ResourceHoler.resource;
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
      // Singleton s = r2.clone();//
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
