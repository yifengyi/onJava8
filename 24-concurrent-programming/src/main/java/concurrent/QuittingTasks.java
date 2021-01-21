package concurrent;

import onjava.Nap;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class QuittingTasks {
  public static final int COUNT = 150;

  public static void main(String[] args) {
    ExecutorService exec =
            Executors.newCachedThreadPool();
   List<QuittableTask> tasks = IntStream.range(1,COUNT)
            .mapToObj(QuittableTask::new)
            .peek(qt->exec.execute(qt))
            .collect(Collectors.toList());
    new Nap(1);
    tasks.forEach(QuittableTask::quit);
    exec.shutdown();
  }
}
