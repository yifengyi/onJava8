package concurrent;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class InterferingTask implements Runnable{
  final int id;
  private static Integer val = 0;
  public InterferingTask(int id) {
    this.id = id;
  }

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      val++;
    }
    System.out.println(id + " " + Thread.currentThread().getName() + " " + val);
  }
}
