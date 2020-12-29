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
//'f()' in 'C' clashes with 'f()' in 'I1'; attempting to use incompatible retu
/*class C5 extends C implements I1{}*/
//'f()' in 'I3' clashes with 'f()' in 'I1'; methods have unrelated
// interface I4 extends I1,I3{}
public class InterfaceCollision {
}
