package concurrent;

import onjava.Nap;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class QuittableTask implements Runnable{

  final int id;

  public QuittableTask(int id) {
    this.id = id;
  }

  private AtomicBoolean running = new AtomicBoolean(true);

  public void quit(){
    running.set(false);
  }

  @Override
  public void run() {
    while (running.get()) {
      new Nap(0.1);
    }
    System.out.print(id + " ");
  }
}
