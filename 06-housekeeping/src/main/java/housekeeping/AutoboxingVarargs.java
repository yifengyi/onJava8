package housekeeping; /**
 * 1.0v created by wujf on 2020-12-28
 */
public class AutoboxingVarargs {
  public static void f(Integer ... args){
    for (Integer arg : args) {
      System.out.print(arg + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    f(1, 2);
    f(4, 5, 6, 7, 8, 9);
    f(10, 11, 12);
  }
}
