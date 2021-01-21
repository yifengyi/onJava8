package patterns;

import java.util.stream.IntStream;

/**
 * 1.0v created by wujf on 2021-1-21
 */
abstract class ApplicationFramework{
  ApplicationFramework(){
    templateMethod();
  }
  abstract void customize1();
  abstract void customize2();

  private void templateMethod(){
    IntStream.range(0,5)
            .forEach(n->{
              customize1();
              customize2();
            });
  }
}
class MyApp extends ApplicationFramework{
  @Override
  void customize1() {
    System.out.print("Hello ");
  }

  @Override
  void customize2() {
    System.out.println("world!");
  }
}
public class TemplateMethod {
  public static void main(String[] args) {
    new MyApp();
  }
}
