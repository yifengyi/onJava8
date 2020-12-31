package reuse;

/**
 * 1.0v created by wujf on 2020-12-28
 */
class Art{
  Art(){
    System.out.println("reuse.Art constructor");
  }
}
class Drawing extends Art{
  Drawing(){
    System.out.println("reuse.Drawing constructor");
  }
}

public class Cartoon extends Drawing{
  public Cartoon(){
    System.out.println("reuse.Cartoon constructor");
  }

  public static void main(String[] args) {
    Cartoon x = new Cartoon();
  }
}
