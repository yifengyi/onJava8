package inner; /**
 * 1.0v created by wujf on 2020-12-30
 */
class D{}
abstract class E{}
class Z extends D{
  E makeE(){
    return new E() {

    };
  }
}
public class MultiImplementation {
  static void takesD(D d){}
  static void takesE(E e){}

  public static void main(String[] args) {
    Z z = new Z();
    takesD(z);
    takesE(z.makeE());
  }
}
