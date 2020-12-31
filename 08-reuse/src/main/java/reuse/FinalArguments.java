package reuse;

/**
 * 1.0v created by wujf on 2020-12-28
 */
class Gizmo{
  public void spin(){}
}
public class FinalArguments {
  void with(final Gizmo g){
    // g = new reuse.Gizmo();
  }
  void without(Gizmo g){
    g = new Gizmo();
    g.spin();
  }

  void f(final int i){
    // i++;
  }
  int g(final int i){
    return i+1;
  }

  public static void main(String[] args) {
    FinalArguments bf = new FinalArguments();
    bf.with(null);
    bf.with(null);
  }
}
