package collections;

import java.util.*;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public class AddingGroups {
  public static void main(String[] args) {
    Collection<Integer> c =
            new ArrayList<>(Arrays.asList(1, 2, 3,4, 5));
    Integer[] moreInts = {6,7,8,9,10};
    c.addAll(Arrays.asList(moreInts));
    Collections.addAll(c, 11, 12, 13, 14,15);
    Collections.addAll(c, moreInts);

    System.out.println(Arrays.toString(c.toArray()));
    List<Integer> list = Arrays.asList(16, 17, 18, 19);
    list.set(1, 99);
    System.out.println(Arrays.toString(list.toArray()));
  }
}
