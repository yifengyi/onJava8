package polymorphism;

/**
 * 1.0v created by wujf on 2020-12-29
 */
class Grain{
  @Override
  public String toString() {
    return "polymorphism.Grain";
  }
}
class Wheat extends Grain{
  @Override
  public String toString() {
    return "polymorphism.Wheat";
  }
}
class Mill{
  Grain process(){
    return new Grain();
  }
}
class WheatMill extends  Mill{
  @Override
  Grain process() {
    return new Wheat();
  }
}

public class CovariantReturn {
  public static void main(String[] args) {
    Mill m  = new Mill();
    Grain g = m.process();
    System.out.println(g);

    m = new WheatMill();
    g = m.process();
    System.out.println(g);
  }
}
