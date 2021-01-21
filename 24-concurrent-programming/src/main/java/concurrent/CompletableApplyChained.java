package concurrent;

import onjava.Timer;

import java.util.concurrent.CompletableFuture;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class CompletableApplyChained {
  public static void main(String[] args) {
    Timer timer = new Timer();
    CompletableFuture<Machina> cf =
            CompletableFuture.completedFuture(
                    new Machina(0))
                    .thenApply(Machina::work)
                    .thenApply(Machina::work)
                    .thenApply(Machina::work)
                    .thenApply(Machina::work);
    System.out.println(timer.duration());
  }
}
