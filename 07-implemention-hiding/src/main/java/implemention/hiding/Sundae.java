package implemention.hiding;

/**
 * 1.0v created by wujf on 2020-12-28
 */
public class Sundae {
  private Sundae(){}
  static Sundae makeASundae(){
    return new Sundae();
  }
}
