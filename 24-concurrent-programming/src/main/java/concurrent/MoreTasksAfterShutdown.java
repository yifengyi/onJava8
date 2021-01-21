package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class MoreTasksAfterShutdown {
  public static void main(String[] args) {
    ExecutorService exec =
            Executors.newSingleThreadExecutor();
    exec.execute(new NapTask(1));
    exec.shutdown();
    try {
      exec.execute(new NapTask(99));
    } catch (RejectedExecutionException e) {
      System.out.println(e);
    }
  }
}
