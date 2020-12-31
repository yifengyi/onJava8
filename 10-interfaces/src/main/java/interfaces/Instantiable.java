package interfaces;

/**
 * 1.0v created by wujf on 2020-12-29
 */
abstract class UnInstantiable{
  abstract void f();
  abstract int g();
}
public class Instantiable extends UnInstantiable{
  @Override
  void f() {
    System.out.println("f()");
  }

  @Override
  int g() {
    return 11;
  }

  public static void main(String[] args) {
    UnInstantiable i = new Instantiable();

  }
}
