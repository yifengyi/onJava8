/**
 * 1.0v created by wujf on 2020-12-28
 */
class Art{
  Art(){
    System.out.println("Art constructor");
  }
}
class Drawing extends Art{
  Drawing(){
    System.out.println("Drawing constructor");
  }
}

public class Cartoon extends Drawing{
  public Cartoon(){
    System.out.println("Cartoon constructor");
  }

  public static void main(String[] args) {
    Cartoon x = new Cartoon();
  }
}
