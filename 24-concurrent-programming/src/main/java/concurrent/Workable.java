package concurrent;

import onjava.Nap;

import java.util.concurrent.CompletableFuture;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class Workable {
  String id;
  final double duration;

  public Workable(String id, double duration) {
    this.id = id;
    this.duration = duration;
  }

  @Override
  public String toString() {
    return "Workable[" + id + "]";
  }

  public static Workable work(Workable tt) {
    new Nap(tt.duration);
    tt.id = tt.id + "W";
    System.out.println(tt);
    return tt;
  }

  public static CompletableFuture<Workable>
  make(String id, double duration) {
    return CompletableFuture.completedFuture(new Workable(id, duration))
            .thenApplyAsync(Workable::work);
  }
}
