/**
 * 1.0v created by wujf on 2020-12-29
 */
interface CanFight{
  void fight();
}
interface CanSwim{
  void swim();
}
interface CanFly{
  void fly();
}
class ActionCharacter{
  public void fight(){}
}
class Hero extends ActionCharacter implements CanFight,CanFly,CanSwim{
  @Override
  public void swim() {

  }

  @Override
  public void fly() {

  }
}
public class Aventure {
  public static void t(CanFight x){
    x.fight();
  }
  public static void u(CanSwim x){
    x.swim();
  }
  public static void v(CanFly x){
    x.fly();
  }
  public static void w(ActionCharacter x){
    x.fight();
  }

  public static void main(String[] args) {
    Hero h = new Hero();
    t(h);
    u(h);
    v(h);
    w(h);
  }
}
