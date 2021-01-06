package onjava;

import java.util.concurrent.TimeUnit;

/**
 * 1.0v created by wujf on 2021-1-6
 */
public class Timer {
  private long start = System.nanoTime();

  public long duration(){
    return TimeUnit.NANOSECONDS.toMillis(System.nanoTime()-start);
  }
  public static long duration(Runnable test){
    Timer timer = new Timer();
    test.run();
    return timer.duration();
  }
}
