package generics;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class GenericMethods {
  public <T> void f(T x){
    System.out.println(x.getClass().getName());
  }

  public static void main(String[] args) {
    GenericMethods gm = new GenericMethods();
    gm.f("");
    gm.f(1);
    gm.f(1.0);
    gm.f(1.0F);
    gm.f('c');
    gm.f(gm);
  }
}
