package inner; /**
 * 1.0v created by wujf on 2020-12-30
 */
public class DotThis {
  void f(){
    System.out.println("DotThis.f()");
  }

  public class Inner{
    public DotThis outer(){
      return DotThis.this;
    }
  }
  public Inner inner(){
    return new Inner();
  }

  public static void main(String[] args) {
    DotThis dt = new DotThis();
    DotThis.Inner dti = dt.inner();
    dti.outer().f();
  }
}
