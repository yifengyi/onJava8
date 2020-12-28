/**
 * 1.0v created by wujf on 2020-12-28
 */
public class Flower {
  int    petalCount = 0;
  String s          = "initial value";
  Flower (int petals){
    petalCount = petals;
    System.out.println("Constructor w/ int arg only, petalCount =" + petalCount);
  }
  Flower(String ss){
    System.out.println("Constructor w/ string arg only ,s = " + ss);
    s =ss;
  }
  Flower(String s, int petals){
    this(petals);
    // this(s);// this 必须在首行,多个this不行
    this.s = s;
    System.out.println("String & int args");
  }
  Flower(){
    this("hi",47);
    System.out.println("no-arg constructor");
  }

  void printPetalCount(){
    // this(11); //普通方法不能这样调用，必须在构造器内部使用
    System.out.println("petalCount = " + petalCount + " s = " + s);
  }

  public static void main(String[] args) {
    Flower x = new Flower();
    x.printPetalCount();
  }
}
