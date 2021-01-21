package concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class Futures {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService exec =
            Executors.newSingleThreadExecutor();
    Future<Integer> f =
            exec.submit(new CountingTask(99));
    System.out.println(f.get());
    exec.shutdown();
  }
}
