package inner; /**
 * 1.0v created by wujf on 2020-12-30
 */
public class DotNew {
  public class Inner{}

  public static void main(String[] args) {
    DotNew dn = new DotNew();
    DotNew.Inner dni = dn.new Inner();

  }
}
