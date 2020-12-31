package reuse;

/**
 * 1.0v created by wujf on 2020-12-28
 */
class Game{
  Game(int i){
    System.out.println("reuse.Game constructor");
  }
}
class BoardGame extends Game{
  BoardGame(int i){
    super(i);
    System.out.println("reuse.BoardGame constructor");
  }
}
public class Chess extends BoardGame{
  Chess(){
    super(11);
    System.out.println("reuse.Chess constructor");
  }

  public static void main(String[] args) {
    Chess x = new Chess();
  }
}
