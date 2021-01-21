package concurrent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class ParallelStreamPuzzle2 {
  public static final Deque<String> TRACE =
          new ConcurrentLinkedDeque<>();
  static class IntGenerator implements Supplier<Integer>{
    private AtomicInteger current = new AtomicInteger();
    @Override
    public Integer get() {
      TRACE.add(current.get() + ": " + Thread.currentThread().getName());
      return current.getAndIncrement();
    }
  }

  public static void main(String[] args) throws IOException {
    List<Integer> x = Stream.generate(new IntGenerator())
            .limit(10)
            .parallel()
            .collect(Collectors.toList());
    System.out.println(x);
    Path p = Paths.get("target", "classes", "PSP2.txt");
    Files.write(p, TRACE);
  }
}
