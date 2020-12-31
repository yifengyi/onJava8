package polymorphism.shape;

/**
 * 1.0v created by wujf on 2020-12-29
 */
public class Shapes {
  public static void main(String[] args) {
    RandomShapes gen = new RandomShapes();
    for (Shape shape : gen.array(9)) {
      shape.draw();
    }
  }
}
