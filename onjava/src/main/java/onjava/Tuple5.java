package onjava;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class Tuple5<A,B,C,D,E> extends Tuple4<A,B,C,D> {
  public final E a5;

  public Tuple5(A a1, B a2, C a3, D a4,E a5) {
    super(a1, a2, a3, a4);
    this.a5 = a5;
  }

  @Override
  public String rep() {
    return super.rep()+", "+a5;
  }
}
