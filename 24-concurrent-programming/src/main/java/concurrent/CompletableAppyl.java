package concurrent;

import java.util.concurrent.CompletableFuture;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class CompletableAppyl {
  public static void main(String[] args) {
    CompletableFuture<Machina> cf =
            CompletableFuture.completedFuture(new Machina(0));
    CompletableFuture<Machina> cf2 =
            cf.thenApply(Machina::work);
    CompletableFuture<Machina> cf3 =
            cf2.thenApply(Machina::work);
    CompletableFuture<Machina> cf4 =
            cf3.thenApply(Machina::work);
    CompletableFuture<Machina> cf5 =
            cf4.thenApply(Machina::work);
  }
}
