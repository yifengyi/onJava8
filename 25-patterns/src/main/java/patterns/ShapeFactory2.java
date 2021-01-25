package patterns;

import patterns.shapes.BadShapeCreation;
import patterns.shapes.FactoryMethod;
import patterns.shapes.FactoryTest;
import patterns.shapes.Shape;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.0v created by wujf on 2021-1-21
 * 动态工厂
 */
public class ShapeFactory2 implements FactoryMethod {
  Map<String, Constructor> factories = new HashMap<>();

  static Constructor load(String id) {
    System.out.println("loading " + id);
    try {
      return Class.forName("patterns.shapes." + id).getConstructor();
    } catch (ClassNotFoundException
            | NoSuchMethodException e) {
      throw new BadShapeCreation(id);
    }
  }


  @Override
  public Shape create(String type) {
    try {
      /* computeIfAbsent() 方法对 hashMap
         中指定 key 的值进行重新计算，
         如果不存在这个 key，则添加到 hasMap 中。*/
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
