package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 1.0v created by wujf on 2021-1-21
 */
class NotRunnable{
  public void go(){
    System.out.println("NotRunnable");
  }
}
class NotCallable{
  public Integer get(){
    System.out.println("NotCallable");
    return 1;
  }
}
public class LambdasAndMethodReferences {
  public static void main(String[] args) {
    ExecutorService exec =
            Executors.newCachedThreadPool();

    exec.submit(() -> System.out.println("Lambda1"));
    exec.submit(new NotRunnable()::go);
    exec.submit(()->{
      System.out.println("Lambda2");
      return 1;
    });
    exec.submit(new NotCallable()::get);
    exec.shutdown();
  }
}
