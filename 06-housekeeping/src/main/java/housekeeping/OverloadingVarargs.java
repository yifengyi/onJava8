package housekeeping; /**
 * 1.0v created by wujf on 2020-12-28
 */
public class OverloadingVarargs {
  static void f(Character ... args){
    System.out.print("first");
    for (Character arg : args) {
      System.out.print(" " + arg);
    }
    System.out.println();
  }
  static void f(Integer ... args){
    System.out.print("second");
    for (Integer arg : args) {
      System.out.print(" " + arg);
    }
    System.out.println();
  }
  static void f(Long ... args){
    System.out.print("third");
  }

  public static void main(String[] args) {
    f('a', 'b', 'c');
    f(1);
    f(2, 1);
    f(0);
    f(0L);
    // f();
  }
}
