package generics;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class ArrayMaker<T> {
  private Class<T> kind;

  public ArrayMaker(Class<T> kind) {
    this.kind = kind;
  }
  @SuppressWarnings("unchecked")
  T[] create(int size){
    return (T[])Array.newInstance(kind, size);
  }

  //对于在泛型中创建数组，使用 Array.newInstance() 是推荐的方式。
  public static void main(String[] args) {
    ArrayMaker<String> stringMaker = new ArrayMaker<>(String.class);
    String[] stringArray = stringMaker.create(9);
    System.out.println(Arrays.toString(stringArray));
  }
}
