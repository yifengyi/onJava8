package generics;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class Manipulator3 {
  private HasF obj;

  public Manipulator3(HasF obj) {
    this.obj = obj;
  }
  public void manipulate(){
    obj.f();
  }
}
