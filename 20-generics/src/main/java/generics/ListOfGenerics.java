package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-1-12
 * 我们无法创建泛型数组。通用解决方案是在试图创建泛型数组的时候使用 ArrayList ：
 */
public class ListOfGenerics<T> {
  private List<T> array = new ArrayList<>();
  public void add(T item){
    array.add(item);
  }
  public T get(int index){
    return array.get(index);
  }
}
