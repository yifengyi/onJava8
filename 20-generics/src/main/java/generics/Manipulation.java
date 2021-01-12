package generics;

/**
 * 1.0v created by wujf on 2021-1-12
 */
class Manipulator<T>{
  private T obj;

  public Manipulator(T obj) {
    this.obj = obj;
  }
  //// Error: cannot find symbol: method f():
  public void manipulate(){
    // obj.f();
  }
}
public class Manipulation {
  public static void main(String[] args) {
    HasF hf = new HasF();
    Manipulator<HasF> manipulator = new Manipulator<>(hf);
    manipulator.manipulate();
  }
}
