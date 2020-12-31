package housekeeping; /**
 * 1.0v created by wujf on 2020-12-28
 */
class Other{
  public static void main(String[] args) {
    for (String arg : args) {
      System.out.print(arg + " ");
    }
  }
}
public class DynamicArray {
  public static void main(String[] args) {
    Other.main(new String[]{"fiddle","de","dum"});

  }
}
