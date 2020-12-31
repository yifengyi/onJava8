package housekeeping; /**
 * 1.0v created by wujf on 2020-12-28
 */
public class ArraysOfPrimitives {
  public static void main(String[] args) {
    int[] a1 = {1,2,3,4,5};
    int[] a2;
    a2 = a1;
    for (int i = 0; i < a2.length; i++) {
      a2[i] +=1;
    }
    for (int i = 0; i < a1.length; i++) {
      System.out.println("a1[" + 1 + "] = " + a1[i]);
    }
  }
}
