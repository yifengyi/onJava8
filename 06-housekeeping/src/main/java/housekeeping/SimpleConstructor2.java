package housekeeping;

/**
 * 1.0v created by wujf on 2020-12-28
 */
class Rock2{
  Rock2(int i){
    System.out.println("housekeeping.Rock " + i+" ");
  }
}
public class SimpleConstructor2 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {

      new Rock2(i);
    }
  }
}
