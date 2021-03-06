package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class CachedThreadPool {
  public static void main(String[] args) {
    ExecutorService exec =
            Executors.newCachedThreadPool();
    IntStream.range(0,10)
            .mapToObj(NapTask::new)
            .forEach(exec::execute);

    exec.shutdown();
  }
}
