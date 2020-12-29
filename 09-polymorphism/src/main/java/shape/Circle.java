package shape;

/**
 * 1.0v created by wujf on 2020-12-29
 */
public class Circle extends Shape {
  @Override
  public void draw(){
    System.out.println("Circle:draw()");
  }

  @Override
  public void erase(){
    System.out.println("Circle.erase()");
  }
}
