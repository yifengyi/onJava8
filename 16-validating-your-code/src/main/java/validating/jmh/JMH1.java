package validating.jmh;

import org.openjdk.jmh.annotations.*;

import java.util.Arrays;

/**
 * 1.0v created by wujf on 2021-1-6
 */
@Warmup(iterations = 5)
@Measurement(iterations = 5)
@Fork(1)
public class JMH1 {
  private long[] la;

  @Setup
  public void setup() {
    la = new long[250_000_000];
  }

  @Benchmark
  public void setAll() {
    Arrays.setAll(la, n -> n);
  }

  @Benchmark
  public void parallelSetAll() {
    Arrays.parallelSetAll(la, n -> n);
  }
}

