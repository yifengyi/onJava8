package polymorphism.shape;

/**
 * 1.0v created by wujf on 2020-12-29
 */
public class Square extends Shape {
  @Override
  public void draw(){
    System.out.println("Square.draw()");
  }
  @Override
  public void erase(){
    System.out.println("Square.erase()");
  }
}
