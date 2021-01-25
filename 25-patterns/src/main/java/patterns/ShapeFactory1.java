package patterns;

import patterns.shapes.*;

/**
 * 1.0v created by wujf on 2021-1-21
 * 工厂创建1：显示创建
 */
public class ShapeFactory1 implements FactoryMethod {
  @Override
  public Shape create(String type) {
    switch(type) {
      case "Circle": return new Circle();
      case "Square": return new Square();
      case "Triangle": return new Triangle();
      default: throw new BadShapeCreation(type);
    }
  }

  public static void main(String[] args) {
    FactoryTest.test(new ShapeFactory1());
  }
}
