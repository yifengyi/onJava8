package housekeeping;

/**
 * 1.0v created by wujf on 2020-12-28
 */
class Bowl{
  Bowl(int marker){
    System.out.println("Bool(" + marker + ")");
  }
  void f1(int marker){
    System.out.println("f1(" + marker + ")");
  }
}
class Table{
  static Bowl bowl = new Bowl(1);
  Table(){
    System.out.println("housekeeping.Table()");
    bowl2.f1(1);
  }
  void f2(int marker){
    System.out.println("f2(" + marker + ")");
  }

  static Bowl bowl2 = new Bowl(2);
}
class Cupboard{
  Bowl bowl3 = new Bowl(3);
  static Bowl bowl4 = new Bowl(4);
  Cupboard(){
    System.out.println("housekeeping.Cupboard()");
    bowl4.f1(2);
  }
  void f3(int marker){
    System.out.println("f3(" + marker + ")");
  }

  static Bowl bowl5 = new Bowl(5);
}
public class StaticInitialization {
  public static void main(String[] args) {
    System.out.println("main creating new housekeeping.Table");
    new Cupboard();
    System.out.println("main creating new housekeeping.Cupboard()");
    new Cupboard();

    table.f2(2);
    cupboard.f3(1);
  }
  static Table table = new Table();
  static Cupboard cupboard = new Cupboard();
}
