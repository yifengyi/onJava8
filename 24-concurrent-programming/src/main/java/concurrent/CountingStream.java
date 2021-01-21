package concurrent;

import java.util.stream.IntStream;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class CountingStream {
  public static void main(String[] args) {
    System.out.println(
            IntStream.range(0, 10)
                    .parallel()
                    .mapToObj(CountingTask::new)
                    .map(ct -> {
                      try {
                        return ct.call();
                      } catch (Exception e) {
                        throw new RuntimeException(e);
                      }
                    })
                    .reduce(0, Integer::sum)
    );
  }
}
