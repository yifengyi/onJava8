package concurrent;

import onjava.Nap;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class QuittingCompletable {
  public static void main(String[] args) {
    List<QuittableTask> tasks =
            IntStream.range(1,QuittingTasks.COUNT)
            .mapToObj(QuittableTask::new)
            .collect(Collectors.toList());
    List<CompletableFuture<Void>> cfutures =
            tasks.stream()
            .map(CompletableFuture::runAsync)
            .collect(Collectors.toList());
    new Nap(1);
    tasks.forEach(QuittableTask::quit);
    cfutures.forEach(CompletableFuture::join);
  }
}
