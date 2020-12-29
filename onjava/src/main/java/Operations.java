/**
 * 1.0v created by wujf on 2020-12-29
 */
public interface Operations {
  void execute();
  static void runOps(Operations ...ops){
    for (Operations op : ops) {
      op.execute();
    }
  }
  static void show(String msg){
    System.out.println(msg);
  }
}
