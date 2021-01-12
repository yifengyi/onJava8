package generics;

/**
 * 1.0v created by wujf on 2021-1-12
 * 泛型类型参数会擦除到它的第一个边界
 */
public class Manipulator2<T extends HasF> {
  private T obj;

  public Manipulator2(T obj) {
    this.obj = obj;
  }
  public void manipulate(){
    obj.f();
  }
}
