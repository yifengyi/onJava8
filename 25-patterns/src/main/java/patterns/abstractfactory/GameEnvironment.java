package patterns.abstractfactory;

import java.util.function.Supplier;

/**
 * 1.0v created by wujf on 2021-1-21
 * //todo
 */
interface Obstracle{
  void action();
}
interface Player{
  void interactWith(Obstracle o);
}
class Kitty implements Player{
  @Override
  public void interactWith(Obstracle o) {
    System.out.print("Kitty has encountered a");
    o.action();
  }
}
class KungFuGuy implements Player{
  @Override
  public void interactWith(Obstracle o) {
    System.out.print("KungFuGuy now battles a");
    o.action();
  }
}
class Puzzle implements Obstracle{
  @Override
  public void action() {
    System.out.println("Puzzle");
  }
}
class NastyWeapon implements Obstracle{
  @Override
  public void action() {
    System.out.println("NastyWeapon");
  }
}
class GameElementFactory{
  Supplier<Player> player;
  Supplier<Obstracle> obstacle;
}
class KittiesAndPuzzles extends GameElementFactory{
  KittiesAndPuzzles(){
    player = Kitty::new;
    obstacle = Puzzle::new;
  }
}
class KillAndDismember extends GameElementFactory{
  KillAndDismember(){
    player = KungFuGuy::new;
    obstacle = NastyWeapon::new;
  }
}
public class GameEnvironment {
  private Player p;
  private Obstracle ob;
  public GameEnvironment(GameElementFactory factory){
    p = factory.player.get();
    ob = factory.obstacle.get();
  }
  public void play(){
    p.interactWith(ob);
  }

  public static void main(String[] args) {
    GameElementFactory
            kp = new KittiesAndPuzzles(),
            kd = new KillAndDismember();
    GameEnvironment
            g1 = new GameEnvironment(kp),
            g2 = new GameEnvironment(kd);
    g1.play();
    g2.play();
  }
}
