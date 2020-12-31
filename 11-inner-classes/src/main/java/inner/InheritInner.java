package inner; /**
 * 1.0v created by wujf on 2020-12-31
 */
class WithInner{
   class Inner{}
}
public class InheritInner extends WithInner.Inner{
  InheritInner(WithInner wi){
    wi.super();
  }

  public static void main(String[] args) {
    WithInner wi = new WithInner();
    InheritInner ii = new InheritInner(wi);
  }
}
