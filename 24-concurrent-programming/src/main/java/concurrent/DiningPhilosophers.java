package concurrent;

import onjava.Nap;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class DiningPhilosophers {
  private StickHolder[] sticks;
  private Philosopher[] philosophers;

  public DiningPhilosophers(int n){
    sticks = new StickHolder[n];
    Arrays.setAll(sticks,i->new StickHolder());
    philosophers = new Philosopher[n];
    Arrays.setAll(philosophers,
            i->new Philosopher(i,sticks[i],sticks[(i+1)%n]) );
// philosophers[1] =                     // [2]
    //   new Philosopher(0, sticks[0], sticks[1]);
    Arrays.stream(philosophers)
            .forEach(CompletableFuture::runAsync);
  }

  public static void main(String[] args) {
    new DiningPhilosophers(5);
    new Nap(3, "Shutdown");
  }
}
