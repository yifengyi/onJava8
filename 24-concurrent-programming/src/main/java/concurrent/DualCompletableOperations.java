package concurrent;

import java.util.concurrent.CompletableFuture;

import static onjava.CompletableUtilities.*;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class DualCompletableOperations {
  static CompletableFuture<Workable> cfA, cfB;

  static void init() {
    cfA = Workable.make("A", 0.15);
    cfB = Workable.make("B", 0.10);
  }

  static void join() {
    cfA.join();
    cfB.join();
    System.out.println("**********************");
  }

  public static void main(String[] args) {
    init();
    voidr(cfA.runAfterEitherAsync(cfB,
            () -> System.out.println("runAfterEither")));

    join();

    init();
    voidr(cfA.runAfterBothAsync(cfB,
            () -> System.out.println("runAfterBoth")));
    join();

    init();
    showr(cfA.applyToEitherAsync(cfB,
            w -> {
              System.out.println("applyToEither: " + w);
              return w;
            }));
    join();

    init();
    voidr(cfA.acceptEitherAsync(cfB,
            w -> {
              System.out.println("acceptEither: " + w);
            }));
    join();

    init();
    voidr(cfA.thenAcceptBothAsync(cfB,
            (w1, w2) -> {
              System.out.println("thenAcceptBoth: " + w1 + ", " + w2);
            }));
    join();

    init();
    CompletableFuture<Workable>
            cfC = Workable.make("C", 0.08),
            cfD = Workable.make("D", 0.09);
    CompletableFuture.anyOf(cfA, cfB, cfC, cfD)
            .thenRunAsync(() ->System.out.println("allOf"));
    join();

  }
}