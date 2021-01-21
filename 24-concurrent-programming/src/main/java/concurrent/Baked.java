package concurrent;

import onjava.Nap;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class Baked {
  static class Pan {
  }

  static Pan pan(Batter b) {
    new Nap(0.1);
    return new Pan();
  }

  static Baked heat(Pan p) {
    new Nap(0.1);
    return new Baked();
  }

  static CompletableFuture<Baked> bake(CompletableFuture<Batter> cfb) {
    return cfb.thenApplyAsync(Baked::pan)
            .thenApplyAsync(Baked::heat);
  }

  public static Stream<CompletableFuture<Baked>> batch() {
    CompletableFuture<Batter> batter = Batter.mix();
    return Stream.of(
            bake(batter),
            bake(batter),
            bake(batter),
            bake(batter)
    );
  }
}
