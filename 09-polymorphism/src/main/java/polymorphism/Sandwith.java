package polymorphism;

/**
 * 1.0v created by wujf on 2020-12-29
 */
class Meal{
  Meal(){
    System.out.println("polymorphism.Meal()");
  }
}
class Bread{
  Bread(){
    System.out.println("polymorphism.Bread()");
  }
}
class Cheese{
  Cheese(){
    System.out.println("polymorphism.Cheese()");
  }
}
class Lettuce{
  Lettuce(){
    System.out.println("polymorphism.Lettuce()");
  }
}
class Lunch extends Meal{
  Lunch(){
    System.out.println("polymorphism.Lunch()");
  }
}
class PortableLunch extends Lunch{
  PortableLunch(){
    System.out.println("polymorphism.PortableLunch()");
  }
}
public class Sandwith extends PortableLunch {
  private Bread b = new Bread();
  private Cheese c = new Cheese();
  private Lettuce l = new Lettuce();

  public Sandwith(){
    System.out.println("polymorphism.Sandwith()");
  }

  public static void main(String[] args) {
    new Sandwith();
  }
}
