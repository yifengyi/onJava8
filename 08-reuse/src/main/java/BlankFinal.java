/**
 * 1.0v created by wujf on 2020-12-28
 */
class Poppet{
  private int i;
  Poppet(int i1){
    i =i1;
  }
}
public class BlankFinal {
  private final int i = 0;
  private final int j;
  private final Poppet p;

  public BlankFinal(){
    j = i;
    p = new Poppet(1);
  }
  public BlankFinal(int x){
    j = x;
    p = new Poppet(x);
  }

  public static void main(String[] args) {
    new BlankFinal();
    new BlankFinal(47);
  }
}
