package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class GenericsAndCovariance {
  public static void main(String[] args) {
    List<? extends Fruit> flist = new ArrayList<>();
    // flist.add(new Apple())
    // flist.add(new Fruit())
    // flist.add(new Object())
    flist.add(null);
    Fruit f = flist.get(0);
  }
}
