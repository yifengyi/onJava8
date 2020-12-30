/**
 * 1.0v created by wujf on 2020-12-30
 */
public class Parcel5 {
  public Destination destination(String s){
    final  class PDestination implements Destination{
      private String label;
      private PDestination (String whereTo){
        label = whereTo;
      }

      @Override
      public String readLabel() {
        return label;
      }
    }
    return new PDestination(s);
  }

  public static void main(String[] args) {
    Parcel5 p = new Parcel5();
    Destination d = p.destination("Tasmania");
  }
}
