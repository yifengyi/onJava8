package generics;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class GenericHolder<T> {
  private T a;
  public GenericHolder(){}
  public void set(T a){
    this.a = a;
  }
  public T get(){
    return a;
  }

  public static void main(String[] args) {
    GenericHolder<Automobile> h3 = new GenericHolder<>();
    h3.set(new Automobile());

    Automobile a = h3.get();
    // h3.set("Not an automobile");
  }
}
