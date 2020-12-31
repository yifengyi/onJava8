package reuse;

/**
 * 1.0v created by wujf on 2020-12-28
 */
class Plate{
  Plate(int i){
    System.out.println("reuse.Plate constructor");
  }
}
class DinnerPlate  extends Plate{
  DinnerPlate(int i){
    super(i);
    System.out.println("reuse.DinnerPlate constructor");
  }
}
class Utensil{
  Utensil(int i){
    System.out.println("reuse.Utensil constructor");
  }
}
class Spoon extends Utensil{
  Spoon(int i){
    super(i);
    System.out.println("reuse.Spoon constructor");
  }
}
class Fork extends Utensil{
  Fork(int i){
    super(i);
    System.out.println("reuse.Fork constructor");
  }
}
class Knife extends Utensil{
  Knife(int i){
    super(i);
    System.out.println("reuse.Knife constructor");
  }
}
class Custom{
  Custom(int i){
    System.out.println("reuse.Custom constructor");
  }
}
public class PlaceSetting extends Custom{
  private  Spoon sp;
  private Fork frk;
  private Knife kn;
  private DinnerPlate pl;
  public PlaceSetting(int i){
    super(i+1);
    sp = new Spoon(i + 2);
    frk = new Fork(i + 3);
    kn = new Knife(i + 4);
    pl = new DinnerPlate(i + 5);
    System.out.println("reuse.PlaceSetting constructor");
  }

  public static void main(String[] args) {
    PlaceSetting x = new PlaceSetting(9);
  }

}
