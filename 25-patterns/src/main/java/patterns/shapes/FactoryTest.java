package patterns.shapes;

import java.util.stream.Stream;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class FactoryTest {
  //在主函数main()里，要记住除非你在最后使用了一个终结操作，否则Stream不会做任何事情。在这里，count()的值被丢弃了。
  public static void test(FactoryMethod factory){
    Stream.of("Circle","Square","Triangle",
            "Square","Circle","Circle","Triangle")
            .map(factory::create)
            .peek(Shape::draw)
            .peek(Shape::erase)
            .count();//终结操作
  }
}
