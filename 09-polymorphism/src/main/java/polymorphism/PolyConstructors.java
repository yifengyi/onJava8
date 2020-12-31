package polymorphism;

/**
 * 1.0v created by wujf on 2020-12-29
 */
class Glyph{
  void draw(){
    System.out.println("polymorphism.Glyph.draw()");
  }
  Glyph(){
    System.out.println("polymorphism.Glyph() before draw()");
    draw();
    System.out.println("polymorphism.Glyph() after draw()");
  }
}
class RoundGlyph extends Glyph{
  private int radius = 1;
  RoundGlyph(int r){
    radius = r;
    System.out.println("polymorphism.RoundGlyph.polymorphism.RoundGlyph(),radius = " + r);
  }

  @Override
  void draw() {
    System.out.println("polymorphism.RoundGlyph.draw(),radius = " + radius);
  }
}
public class PolyConstructors {
  public static void main(String[] args) {
    new RoundGlyph(5);
  }
}
