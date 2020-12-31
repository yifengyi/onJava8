package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 1.0v created by wujf on 2020-12-31
 */
class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}
public class AsListInference {
  public static void main(String[] args) {
    List<Snow> snow1 = Arrays.asList(
            new Crusty(),new Slush(),new Powder()
    );
    List<Snow> snow2 = Arrays.asList(
            new Light(),new Heavy()
    );
    List<Snow> snow3 = new ArrayList<>();
    Collections.addAll(snow3, new Light(), new Heavy(), new Powder());

    snow3.add(new Crusty());

    //Arrays.<collections.Snow>asList explicit type argument specification 显式类型参数说明
    List<Snow> snow4 = Arrays.<Snow>asList(
            new Light(),new Heavy(),new Slush()
    );
    // snow4.add(new collections.Powder());//java.lang.UnsupportedOperationException
    System.out.println(snow4);
  }
}
