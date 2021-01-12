package generics;

/**
 * 1.0v created by wujf on 2021-1-12
 */
class GenericBase<T>{
  private T element;
  public void set(T arg){
    element = arg;
  }
  public T get(){
    return element;
  }
}
class Derived1<T> extends GenericBase<T>{}
class Derived2 extends GenericBase{}
// class Derived3 extends GenericBase<?> {}
// Strange error:
public class ErasureAndInheritance {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    Derived2 d2 = new Derived2();
    Object obj = d2.get();
    d2.set(obj); // Warning here!
  }
}
