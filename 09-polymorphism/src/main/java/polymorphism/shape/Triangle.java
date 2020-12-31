package polymorphism.shape;

/**
 * 1.0v created by wujf on 2020-12-29
 */
public class Triangle extends Shape {
  @Override
  public void draw(){
    System.out.println("Triangle.draw()");
  }
  @Override
  public  void erase(){
    System.out.println("Triangle.erase()");
  }
}
