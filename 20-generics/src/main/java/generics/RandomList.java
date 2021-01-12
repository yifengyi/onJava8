package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class RandomList<T> extends ArrayList<T> {
  private Random rand = new Random(47);
  public T select(){
    return get(rand.nextInt(size()));
  }

  public static void main(String[] args) {
    RandomList<String > rs = new RandomList<>();
    Arrays.stream("The quick brown fox jumped over the lazy brown dog".split(" ")).forEach(rs::add);
    IntStream.range(0, 11).forEach(i -> System.out.print(rs.select() + " "));
  }
}
