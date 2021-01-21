package concurrent;

import java.util.stream.Stream;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class StreamExceptions {
  static Stream<Breakable> test(String id,int failcount){
    return Stream.of(new Breakable(id, failcount))
            .map(Breakable::work)
            .map(Breakable::work)
            .map(Breakable::work)
            .map(Breakable::work);
  }

  public static void main(String[] args) {
    test("A", 1);
    test("B", 2);
    Stream<Breakable> c = test("C", 3);
    test("D", 4);
    test("E", 5);

    System.out.println("Entering try");
    try {
      c.forEach(System.out::println);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
