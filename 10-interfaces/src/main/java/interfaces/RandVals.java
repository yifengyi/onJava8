package interfaces;

import java.util.Random;

/**
 * 1.0v created by wujf on 2020-12-29
 */
public interface RandVals {
  Random RAND = new Random(47);
  int RANDOM_INT =RAND.nextInt(10);
  long RANDOM_LONG = RAND.nextLong()*10;
  float RANDOM_FLOAT = RAND.nextLong()*10;
  double RANDOM_DOUBLE = RAND.nextDouble()*10;
}
