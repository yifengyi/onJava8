/**
 * 1.0v created by wujf on 2020-12-28
 */
public class DerivedSpaceShip extends SpaceShipControls {
  private String name;
  public DerivedSpaceShip(String name){
    this.name = name;
  }
  @Override
  public String toString(){
    return name;
  }

  public static void main(String[] args) {
    DerivedSpaceShip protector =
            new DerivedSpaceShip("NSEA Protector");
    protector.forward(100);
  }
}
