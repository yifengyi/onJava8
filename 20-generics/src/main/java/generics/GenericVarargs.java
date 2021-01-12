package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class GenericVarargs {
  @SafeVarargs
  public static <T> List<T> makeList(T ...args){
    List<T> res = new ArrayList<>();
    for (T item : args) {
      res.add(item);
    }
    return res;
  }

  public static void main(String[] args) {
    List<String> ls = makeList("A");
    System.out.println(ls);
    ls = makeList("A", "B", "C");
    System.out.println(ls);
    ls = makeList(
            "ABCDEFFHIJKLMNOPQRSTUVWXYZ".split(""));
    System.out.println(ls);
  }
}
