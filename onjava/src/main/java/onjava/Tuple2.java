package onjava;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class Tuple2<A,B> {
  public final A a1;
  public final B a2;

  public Tuple2(A a1, B a2) {
    this.a1 = a1;
    this.a2 = a2;
  }
  public String rep(){
    return a1+", "+a2;
  }

  @Override
  public String toString() {
    return "(" + rep() + ")";
  }
}
