package reuse;

/**
 * 1.0v created by wujf on 2020-12-28
 */
class Homer{
  char doh(char c){
    System.out.println("doh(char)");
    return 'd';
  }
  float doh(float f){
    System.out.println("doh(float)");
    return 1.0f;
  }
}
class Milhouse{}
class Bart extends Homer{
  //方法重载 不是重写
  void doh(Milhouse m){
    System.out.println("doh(reuse.Milhouse)");
  }
}
class List extends Homer{
  // @Override //此处报错 是方法重载 不是重写
  void doh(Milhouse m){
    System.out.println("doh(reuse.Milhouse)");
  }
}
public class Hide {
  public static void main(String[] args) {
    Bart b = new Bart();
    b.doh(1);
    b.doh('x');
    b.doh(1.0f);
    b.doh(new Milhouse());
  }
}
