package reuse;

/**
 * 1.0v created by wujf on 2020-12-28
 */
class Shape{
  Shape(int i){
    System.out.println("reuse.Shape constructor");
  }
  void dispose(){
    System.out.println("reuse.Shape dispose");
  }
}
class Circle extends Shape{
  Circle(int i){
    super(i);
    System.out.println("reuse.Drawing reuse.Circle");
  }
  @Override
  void dispose(){
    System.out.println("Erasing reuse.Circle");
    super.dispose();
  }
}
class Triangle extends Shape{
  Triangle(int i){
    super(i);
    System.out.println("reuse.Drawing reuse.Triangle");
  }
  @Override
  void dispose(){
    System.out.println("Erasing reuse.Triangle");
    super.dispose();
  }
}
class Line extends Shape{
  private int start,end;
  Line(int start,int end){
    super(start);
    this.start = start;
    this.end=end;
    System.out.println("reuse.Drawing reuse.Line:"+start+", "+end);
  }
  @Override
  void dispose(){
    System.out.println("Erasing reuse.Line:"+start+", "+end);
    super.dispose();
  }
}
public class CADSystem extends Shape{
  private Circle c;
  private Triangle t;
  private Line[] lines = new Line[3];
  public CADSystem(int i){
    super(i + 1);
    for (int j = 0; j < lines.length; j++) {
      lines[j] = new Line(j, j * j);
    }
    c = new Circle(1);
    t = new Triangle(1);
    System.out.println("Combined constructor");
  }
  @Override
  public void dispose(){
    t.dispose();
    c.dispose();
    for (int i = lines.length-1; i >=0; i--) {
      lines[i].dispose();
    }
    super.dispose();
  }

  public static void main(String[] args) {
    CADSystem x = new CADSystem(47);
    try {

    }finally {
      x.dispose();
    }
  }
}
