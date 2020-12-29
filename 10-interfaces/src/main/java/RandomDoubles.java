import java.util.Random;

/**
 * 1.0v created by wujf on 2020-12-29
 */
public interface RandomDoubles {
  Random RAND = new Random(47);
  default double next(){
    return RAND.nextDouble();
  }

  static void main(String[] args) {
    RandomDoubles rd = new RandomDoubles() {} ;
    for (int i = 0; i < 7; i++) {
      System.out.print(rd.next() + " ");
    }
  }
}
