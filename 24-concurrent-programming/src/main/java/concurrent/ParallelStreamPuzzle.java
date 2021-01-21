package concurrent;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class ParallelStreamPuzzle {
  static class IntGenerator implements Supplier<Integer>{
    private int current = 0;

    @Override
    public Integer get() {
      return current++;
    }
  }

  public static void main(String[] args) {
    List<Integer> x = Stream.generate(new IntGenerator())
            .limit(10)
            .parallel()
            .collect(Collectors.toList());
    System.out.println(x);
  }
}
