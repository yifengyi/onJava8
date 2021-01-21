package concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class CompletableExceptions {
  static CompletableFuture<Breakable> test(String id,int failcount) {
    return CompletableFuture.completedFuture(
            new Breakable(id, failcount))
            .thenApply(Breakable::work)
            .thenApply(Breakable::work)
            .thenApply(Breakable::work)
            .thenApply(Breakable::work);
  }

  public static void main(String[] args) {
    test("A", 1);
    test("B", 2);
    test("C", 3);
    test("D", 4);
    test("E", 5);

    try {
      test("F",2).get();
    } catch (InterruptedException | ExecutionException e) {
      System.out.println(e.getMessage());
    }

    System.out.println(test("G", 2).isCompletedExceptionally());

    System.out.println(test("H", 2).isDone());

    CompletableFuture<Integer> cfi =
            new CompletableFuture<>();
    System.out.println("done? " + cfi.isDone());
    cfi.completeExceptionally(new RuntimeException("forced"));
    try {
      cfi.get();
    } catch (InterruptedException | ExecutionException e) {
      System.out.println(e.getMessage());
    }
  }
}
