package interfaces;

/**
 * 1.0v created by wujf on 2020-12-29
 */
interface I1{
  void f();
}
interface I2{
  int f(int i);
}
interface I3{
  int f();
}
class C{
  public int f(){
    return 1;
  }
}
class C2 implements  I1,I2{
  @Override
  public void f() {

  }

  @Override
  public int f(int i) {
    return 1;
  }
}
class C3 extends C implements I2{
  @Override
  public int f(int i) {
    return 1;
  }
}
class C4 extends C implements I3{
  @Override
  public int f() {
    return 1;
  }
}
//'f()' in 'interfaces.C' clashes with 'f()' in 'interfaces.I1'; attempting to use incompatible retu
/*class C5 extends interfaces.C implements interfaces.I1{}*/
//'f()' in 'interfaces.I3' clashes with 'f()' in 'interfaces.I1'; methods have unrelated
// interface I4 extends interfaces.I1,interfaces.I3{}
public class InterfaceCollision {
}
