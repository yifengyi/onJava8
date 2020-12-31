package polymorphism.shape;

import java.util.Random;

/**
 * 1.0v created by wujf on 2020-12-29
 */
public class RandomShapes {
  private Random rand = new Random(47);

  public Shape getShape(){
    switch (rand.nextInt(3)){
      default:
      case 0:return new Circle();
      case 1:return new Square();
      case 2:return new Triangle();
    }
  }

  public Shape[] array(int sz){
    Shape[] shapes = new Shape[sz];
    for (int i = 0; i < shapes.length; i++) {
      shapes[i]= getShape();
    }
    return shapes;
  }
}
