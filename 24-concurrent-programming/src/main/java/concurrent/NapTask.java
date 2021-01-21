package concurrent;

import onjava.Nap;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class NapTask implements Runnable{
  final int id;

  public NapTask(int id) {
    this.id = id;
  }

  @Override
  public void run() {
    new Nap(0.1);
    System.out.println(this + " " + Thread.currentThread().getName());
  }

  @Override
  public String toString() {
    return "NapTask[" + id + "]";
  }
}
