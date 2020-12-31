package onjava;

import java.util.concurrent.TimeUnit;

/**
 * 1.0v created by wujf on 2020-12-28
 */
public class Nap {
  public Nap(double t){
    try {
      TimeUnit.MILLISECONDS.sleep((int)(1000*t));
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
  public Nap(double t,String msg){
    this(t);
    System.out.println(msg);
  }
}
