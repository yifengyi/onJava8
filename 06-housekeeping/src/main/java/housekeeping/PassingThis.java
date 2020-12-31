package housekeeping;

/**
 * 1.0v created by wujf on 2020-12-28
 */
class Person{
  public void eat(Apple apple){
    Apple peeled = apple.getPeeled();
    System.out.println("Yummy");
  }
}
class Peeler{
  static Apple peel(Apple apple){

    return apple;
  }
}
class Apple{
   Apple getPeeled(){

     return Peeler.peel(this);
  }
}
public class PassingThis {
  public static void main(String[] args) {
    new Person().eat(new Apple());
  }
}
