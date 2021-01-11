package typeinfo;

import java.util.Random;

/**
 * 1.0v created by wujf on 2021-1-11
 */
class Initable{
  static final int  STAITC_FINAL =47;
  static final int STATIC_FINAL2 =
          ClassInitialization.rand.nextInt(1000);
  static {
    System.out.println("Initializing Initable");
  }
}
class Initable2{
  static int staticNonFinal = 147;
  static{
    System.out.println("Initializing Initable2");
  }
}
class Initable3{
  static int staticNonFinal = 74;
  static {
    System.out.println("Initializing Initable3");
  }
}
public class ClassInitialization {
  public static Random rand = new Random(47);

  public static void main(String[] args) throws ClassNotFoundException {
    Class initable = Initable.class;
    System.out.println("After creating Initable ref");
    System.out.println(Initable.STAITC_FINAL);
    System.out.println(Initable.STATIC_FINAL2);
    System.out.println(Initable2.staticNonFinal);
    Class initable3 = Class.forName("typeinfo.Initable3");
    System.out.println("After creating Initable3 ref");
    System.out.println(Initable3.staticNonFinal);
  }
}
