package inner;

/**
 * 1.0v created by wujf on 2020-12-30
 */
class MNA {
  private void f(){}

  class A{
    private void g(){}

    public class B{
      void h(){
        g();
        f();
      }
    }
  }
}

public class  MultiNestingAccess{
  public static void main(String[] args) {
    MNA mna = new MNA();
    MNA.A mnaa = mna.new A();
    MNA.A.B mnaab = mnaa.new B();
    mnaab.h();
  }
}
