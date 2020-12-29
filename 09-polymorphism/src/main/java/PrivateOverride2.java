/**
 * 1.0v created by wujf on 2020-12-29
 */
public class PrivateOverride2 {
  private void f(){
    System.out.println("private f()");
  }
}

class Derived2 extends PrivateOverride2{
  /* 不能重写私有方法
  @Override
  private void f(){

  }*/
}
