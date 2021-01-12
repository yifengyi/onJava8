package generics;

import java.util.Arrays;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class CompilerIntelligence {
  public static void main(String[] args) {
    List<? extends Fruit> flist = Arrays.asList(new Apple());
    Apple a = (Apple) flist.get(0);
    flist.contains(new Apple());
    flist.indexOf(new Apple());

  }
}
