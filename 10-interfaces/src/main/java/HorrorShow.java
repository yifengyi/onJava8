/**
 * 1.0v created by wujf on 2020-12-29
 */
interface Monster{
  void menace();
}
interface DangerousMonster extends Monster{
  void destroy();
}
interface Leghal{
  void kill();
}
class DragonZilla implements DangerousMonster{
  @Override
  public void menace() {

  }

  @Override
  public void destroy() {

  }
}
interface Vampire extends DangerousMonster,Leghal{
  void drinkBlood();
}
class VeryBadVampire implements Vampire{
  @Override
  public void menace() {

  }

  @Override
  public void destroy() {

  }

  @Override
  public void kill() {

  }

  @Override
  public void drinkBlood() {

  }
}
public class HorrorShow {
  static void u(Monster b){
    b.menace();
  }
  static void v(DangerousMonster d){
    d.menace();
    d.destroy();
  }
  static void w(Leghal l){
    l.kill();
  }

  public static void main(String[] args) {
    DangerousMonster barney = new DragonZilla();
    u(barney);
    v(barney);
    Vampire vlad = new VeryBadVampire();
    u(vlad);
    v(vlad);
    w(vlad);
  }
}
