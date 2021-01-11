package typeinfo;

import java.util.stream.Stream;

/**
 * 1.0v created by wujf on 2021-1-11
 */
abstract class Shape{
  void draw(){
    System.out.println(this + ".draw()");
  }

  @Override
  public abstract String toString() ;
}
class Circle extends Shape{
  @Override
  public String toString() {
    return "Circle";
  }
}
class Square extends Shape{
  @Override
  public String toString() {
    return "Square";
  }
}
class Triangle extends Shape{
  @Override
  public String toString() {
    return "Triangle";
  }
}
public class Shapes {
  public static void main(String[] args) {
    Stream.of(
            new Circle(),new Square(),new Triangle()
    ).forEach(Shape::draw);
  }
}
