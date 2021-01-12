package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class ListMaker<T> {
  List<T> create(){
    return new ArrayList<>();
  }

  public static void main(String[] args) {
    ListMaker<String> stringMaker = new ListMaker<>();
    List<String> stringList = stringMaker.create();
  }
}
