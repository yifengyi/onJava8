package concurrent;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class Breakable {
  String id;
  private int failcount;

  public Breakable(String id, int failcount) {
    this.id = id;
    this.failcount = failcount;
  }

  @Override
  public String toString() {
    return "Breakable_" + id + " [" + failcount + "]";
  }

  public static Breakable work(Breakable b){
    if (--b.failcount ==0) {
      System.out.println(
              "Throwing Exception for "+b.id +""
      );
      throw new RuntimeException("Breakable_" + b.id + " failed");
    }
    System.out.println(b);
    return b;
  }
}
