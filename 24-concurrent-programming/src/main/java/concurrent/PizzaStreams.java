package concurrent;

import onjava.Timer;

import java.util.stream.IntStream;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class PizzaStreams {
  static final int QUANTITY = 5;

  public static void main(String[] args) {
    Timer timer = new Timer();
    IntStream.range(0,QUANTITY)
            .mapToObj(Pizza::new)
            .parallel()
            .forEach(za->{
              while (!za.complete()) {
                za.next();
              }
            });
    System.out.println(timer.duration());

  }
}
