package validating;

import static com.google.common.base.Preconditions.*;
/**
 * 1.0v created by wujf on 2021-1-6
 */
public class NonNullConstruction {
  private Integer n;
  private String s;

  NonNullConstruction(Integer n,String s){
    this.n = checkNotNull(n);
    this.s = checkNotNull(s);
  }

  public static void main(String[] args) {
    NonNullConstruction nn =
            new NonNullConstruction(3, "Trousers");
  }
}
