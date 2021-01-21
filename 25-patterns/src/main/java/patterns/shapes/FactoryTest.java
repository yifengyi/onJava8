package patterns.shapes;

import java.util.stream.Stream;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class FactoryTest {
  public static void test(FactoryMethod factory){
    Stream.of("Circle","Square","Triangle",
            "Square","Circle","Circle","Triangle")
            .map(factory::create)
            .peek(Shape::draw)
            .peek(Shape::erase)
            .count();
  }
}
