package patterns;

/**
 * 1.0v created by wujf on 2021-1-21
 */
class A{
  A(int x){

  }
}
class B{
  B(long x){}
}
class C{
  C(double x){}
}
public class Facade {
  static A makeA(int x) { return new A(x); }
  static B makeB(long x) { return new B(x); }
  static C makeC(double x) { return new C(x); }
  public static void main(String[] args) {
    // The client programmer gets the objects
    // by calling the static methods:
    A a = Facade.makeA(1);
    B b = Facade.makeB(1);
    C c = Facade.makeC(1.0);
  }
}
