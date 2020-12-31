package polymorphism;

/**
 * 1.0v created by wujf on 2020-12-29
 */
class Useful{
  public void f(){}
  public void g(){}
}
class MorUseful extends  Useful{
  @Override
  public void f() {

  }

  @Override
  public void g() {

  }
  public void u(){}
  public void v(){}
  public void w(){}
}
public class RTTI {
  public static void main(String[] args) {
    Useful[] x = {
            new Useful(),
            new MorUseful()
    };
    x[0].f();
    x[1].g();
    ((MorUseful)x[1]).u();
    // ((polymorphism.MorUseful)x[0]).u();
  }
}
