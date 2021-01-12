package generics;

import java.util.Iterator;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
  private int n;

  public IterableFibonacci(int n) {
    this.n = n;
  }

  @Override
  public Iterator<Integer> iterator() {
    return new Iterator<Integer>() {
      @Override
      public boolean hasNext() {
        return n>0;
      }

      @Override
      public Integer next() {
        n--;
        return IterableFibonacci.this.get();
      }

      @Override
      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
  }

  public static void main(String[] args) {
    for (Integer i : new IterableFibonacci(18)) {
      System.out.print(i + " ");
    }
  }
}
