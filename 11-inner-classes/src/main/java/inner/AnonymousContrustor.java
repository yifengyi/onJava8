package inner; /**
 * 1.0v created by wujf on 2020-12-30
 */
abstract class Base{
  Base(int i){
    System.out.println("Base constructor, i = " + i);
  }
  public abstract void f();
}
public class AnonymousContrustor {
  public static Base getBase(int i){
    return new Base(i) {
      {
        System.out.println("Inside instance initializer");
      }
      @Override
      public void f() {
        System.out.println("In anonymous f()");
      }


    };
  }

  public static void main(String[] args) {
    Base base = getBase(47);
    base.f();
  }
}
