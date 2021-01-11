package typeinfo.interfacea;

/**
 * 1.0v created by wujf on 2021-1-11
 */
class B implements A{
  @Override
  public void f() {

  }
  public void g(){
    System.out.println("b");
  }
}
public class InterfaceViolation{
  public static void main(String[] args) {
    A a = new B();
    a.f();
    System.out.println(a.getClass().getName());
    if(a instanceof B){
      B b = ((B) a);
      b.g();
    }
  }

}