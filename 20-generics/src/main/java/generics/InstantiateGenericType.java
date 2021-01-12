package generics;

import java.util.function.Supplier;

/**
 * 1.0v created by wujf on 2021-1-12
 */
class ClassAsFactory<T> implements Supplier<T>{
  Class<T> kind;

  public ClassAsFactory(Class<T> kind) {
    this.kind = kind;
  }

  @Override
  public T get() {
    try {
      return kind.newInstance();
    } catch (InstantiationException | IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }
}
class Employee{
  @Override
  public String toString() {
    return "Employee";
  }
}
public class InstantiateGenericType {
  public static void main(String[] args) {
    ClassAsFactory<Employee> fe =
            new ClassAsFactory<>(Employee.class);
    System.out.println(fe.get());
    ClassAsFactory<Integer> fi =
            new ClassAsFactory<>(Integer.class);
    try {
      System.out.println(fi.get());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
