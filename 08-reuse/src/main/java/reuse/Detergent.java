package reuse;

/**
 * 1.0v created by wujf on 2020-12-28
 */
class Cleanser{
  private String s = "reuse.Cleanser";
  public void append(String a){
    s +=a;
  }
  public void dilute(){
    append("dilute()");
  }
  public void apply(){
    append("apply()");
  }
  public void scrub(){
    append("scrub()");
  }
  @Override
  public String toString(){
    return s;
  }

  public static void main(String[] args) {
    Cleanser x = new Cleanser();
    x.dilute();
    x.apply();
    x.scrub();
    System.out.println(x);
  }
}
public class Detergent  extends Cleanser{
  @Override
  public void scrub(){
    append(" reuse.Detergent.scrub()");
    super.scrub();
  }
  public void foam(){
    append(" foam()");
  }

  public static void main(String[] args) {
    Detergent x = new Detergent();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    System.out.println(x);
    System.out.println("Testing base class:");
    Cleanser.main(args);

  }
}
