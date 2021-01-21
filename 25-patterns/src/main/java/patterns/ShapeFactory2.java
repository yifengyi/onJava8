package patterns;

import patterns.shapes.FactoryMethod;
import patterns.shapes.FactoryTest;
import patterns.shapes.Shape;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class ShapeFactory2 implements FactoryMethod {
  Map<String, Constructor> factories = new HashMap<>();

  static Constructor load(String id) {
    System.out.println("loading " + id);
    try {
      return Class.forName("patterns.shapes." + id).getConstructor();
    } catch (ClassNotFoundException
            | NoSuchMethodException e) {
      throw new RuntimeException(e);
    }
  }


  @Override
  public Shape create(String type) {
    try {
      return (Shape) factories
              .computeIfAbsent(type, ShapeFactory2::load)
              .newInstance();
    } catch (InstantiationException
            | IllegalAccessException
            | InvocationTargetException e) {
      throw new RuntimeException(e);
    }
  }

  public static void main(String[] args) {
    FactoryTest.test(new ShapeFactory2());
  }
}
