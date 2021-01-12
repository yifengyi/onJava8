package generics;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class GenericHolder2<T> {
  private T obj;

  public void set(T obj) {
    this.obj = obj;
  }

  public T get() {
    return obj;
  }

  public static void main(String[] args) {
    GenericHolder2<String> holder =  new GenericHolder2<>();
    holder.set("Item");
    String s = holder.get();
  }
}
