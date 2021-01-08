package strings;

import java.util.stream.Stream;

/**
 * 1.0v created by wujf on 2021-1-8
 */
public class InfiniteRecursion {
  @Override
  public String toString() {
    // return "InfiniteRecursion address: " + this + "\n";//递归 内存溢出
    return "InfiniteRecursion address: " + super.toString() + "\n";
  }

  public static void main(String[] args) {
    Stream.generate(InfiniteRecursion::new)
            .limit(1)
            .forEach(System.out::println);
  }
}
