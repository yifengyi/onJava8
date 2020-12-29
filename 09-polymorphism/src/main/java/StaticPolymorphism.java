/**
 * 1.0v created by wujf on 2020-12-29
 */
class StaticSuper{
  public static String staticGet(){
    return "Base staticGet()";
  }
  public  String dynamicGet(){
    return "Base dynamicGet()";
  }
}

class StaticSub extends StaticSuper{
  public static String staticGet(){
    return "Derive staticGet()";
  }

  @Override
  public String dynamicGet() {
    return "Derive dynamicGet()";
  }
}
public class StaticPolymorphism {
  public static void main(String[] args) {
    StaticSuper sup = new StaticSub();
    System.out.println(StaticSuper.staticGet());
    System.out.println(sup.dynamicGet());
  }
}
