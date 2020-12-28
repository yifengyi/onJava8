/**
 * 1.0v created by wujf on 2020-12-28
 */
class WithFinals{
  private final void f(){
    System.out.println("WithFinals.f()");
  }
  private  void g(){
    System.out.println("WithFinals.g()");
  }
}
class OverridingPrivate extends  WithFinals{
  private final void f(){
    System.out.println("OverridingPrivate.f()");
  }
  private void g(){
    System.out.println("OverridingPrivate.g()");
  }
}
class OverrigingPrivate2 extends OverridingPrivate{
  public final void f(){
    System.out.println("OverridingPrivate2.f()");
  }
  public void g(){
    System.out.println("OverridingPrivate2.g()");
  }
}
public class FinalOverridingIllusion {
  public static void main(String[] args) {
    OverrigingPrivate2 op2 = new OverrigingPrivate2();
    op2.f();
    op2.g();
    OverridingPrivate op = op2;
    WithFinals wf = op2;

  }
}
