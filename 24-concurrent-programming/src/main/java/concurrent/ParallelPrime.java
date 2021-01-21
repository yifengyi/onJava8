package concurrent;

import onjava.Timer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class ParallelPrime {
  static final int COUNT= 100_000;
  public static boolean isPrime(long n){
    return LongStream.
            rangeClosed(2, (long) Math.sqrt(n))
            .noneMatch(i -> n % i == 0);
  }

  public static void main(String[] args) throws IOException {
    Timer timer = new Timer();
    List<String> prims =
            LongStream.iterate(2,i->i+1)
            .parallel()
            .filter(ParallelPrime::isPrime)
            .limit(COUNT)
            .mapToObj(Long::toString)
            .collect(Collectors.toList());

    System.out.println(timer.duration());
    Path p = Paths.get("target","classes","primes.txt");
    Files.write(p, prims, StandardOpenOption.CREATE);


  }
}
