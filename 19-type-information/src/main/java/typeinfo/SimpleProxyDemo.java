package typeinfo;

/**
 * 1.0v created by wujf on 2021-1-11
 */
interface Interface{
  void doSomething();

  void somethingElse(String arg);
}
class RealObject implements Interface{
  @Override
  public void doSomething() {
    System.out.println("doSomething");
  }

  @Override
  public void somethingElse(String arg) {
    System.out.println("somethingElse " + arg);
  }
}
class SimpleProxy implements Interface{
  private Interface proxied;
  SimpleProxy(Interface proxied){
    this.proxied = proxied;
  }

  @Override
  public void doSomething() {
    System.out.println("SimpleProxy doSomething");
    proxied.doSomething();
  }

  @Override
  public void somethingElse(String arg) {
    System.out.println("SimpleProxy somethingElse "+arg);
    proxied.somethingElse(arg);
  }
}
public class SimpleProxyDemo {
  public static void consumer(Interface iface){
    iface.doSomething();
    iface.somethingElse("bonobo");
  }

  public static void main(String[] args) {
    consumer(new RealObject());
    consumer(new SimpleProxy(new RealObject()));
  }
}
