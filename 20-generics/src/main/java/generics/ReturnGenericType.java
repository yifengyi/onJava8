package generics;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class ReturnGenericType<T extends HasF> {
  private T obj;

  public ReturnGenericType(T obj) {
    this.obj = obj;
  }

  public T get(){
    return obj;
  }
}
