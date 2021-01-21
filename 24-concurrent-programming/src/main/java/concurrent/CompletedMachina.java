package concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class CompletedMachina {
  public static void main(String[] args) {
    CompletableFuture<Machina> cf =
            CompletableFuture.completedFuture(new Machina(0));
    try {
      Machina m = cf.get();
    } catch (InterruptedException | ExecutionException e) {
      throw new RuntimeException(e);
    }
  }
}
