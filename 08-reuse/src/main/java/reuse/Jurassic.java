package reuse;

/**
 * 1.0v created by wujf on 2020-12-28
 */
class SmallBrain{}
final class Dincsaur{
  int i = 7;
  int j = 1;
  SmallBrain x = new SmallBrain();
  void f(){}
}
public class Jurassic {
  public static void main(String[] args) {
    Dincsaur n = new Dincsaur();
    n.f();
    n.i = 40;
    n.j++;
  }
}
