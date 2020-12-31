package inner;

/**
 * 1.0v created by wujf on 2020-12-30
 */
public class Pracle1 {
  class Contents{
    private int i= 11;

    public int value (){
      return i;
    }
  }

  class Destination{
    private String label;

    Destination(String whereTo){
      label = whereTo;
    }
    String readLabel(){
      return label;
    }
  }

  public void ship(String dest){
    Contents c = new Contents();
    Destination d = new Destination(dest);
    System.out.println(d.readLabel());
  }

  public static void main(String[] args) {
    Pracle1 p = new Pracle1();
    p.ship("Tasmania");
  }
}
