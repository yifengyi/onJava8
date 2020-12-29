/**
 * 1.0v created by wujf on 2020-12-29
 */
class Glyph{
  void draw(){
    System.out.println("Glyph.draw()");
  }
  Glyph(){
    System.out.println("Glyph() before draw()");
    draw();
    System.out.println("Glyph() after draw()");
  }
}
class RoundGlyph extends Glyph{
  private int radius = 1;
  RoundGlyph(int r){
    radius = r;
    System.out.println("RoundGlyph.RoundGlyph(),radius = " + r);
  }

  @Override
  void draw() {
    System.out.println("RoundGlyph.draw(),radius = " + radius);
  }
}
public class PolyConstructors {
  public static void main(String[] args) {
    new RoundGlyph(5);
  }
}
