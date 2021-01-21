package concurrent;

import onjava.Timer;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class OnePizza {
  public static void main(String[] args) {
    Pizza za = new Pizza(0);
    System.out.println(
            Timer.duration(()->{
              while (!za.complete()) {
                za.next();
              }
            })
    );
  }
}
