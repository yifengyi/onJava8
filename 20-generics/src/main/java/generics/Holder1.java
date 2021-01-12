package generics;

/**
 * 1.0v created by wujf on 2021-1-12
 */
class Automobile{}
public class Holder1 {
  private Automobile a;

  public Holder1(Automobile a) {
    this.a = a;
  }
  Automobile get(){
    return a;
  }
}
