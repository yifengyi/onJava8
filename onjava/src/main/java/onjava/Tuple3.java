package onjava;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class Tuple3<A,B,C>extends Tuple2<A,B> {
  public final C a3;
  public Tuple3(A a1, B a2,C a3) {
    super(a1, a2);
    this.a3 = a3;
  }

  @Override
  public String rep() {
    return super.rep()+", "+a3;
  }
}
