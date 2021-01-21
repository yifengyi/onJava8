package onjava;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class CompletableUtilities {
  public static void showr(CompletableFuture<?> c){
    try {
      System.out.println(c.get());
    } catch (InterruptedException | ExecutionException e) {
      throw new RuntimeException(e);
    }
  }
  public static void voidr(CompletableFuture<?> c){
    try {
      c.get();
    } catch (InterruptedException | ExecutionException e) {
      throw new RuntimeException(e);
    }
  }

}
