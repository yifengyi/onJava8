package validating;

/**
 * 1.0v created by wujf on 2021-1-6
 */
public class CircularQueueException extends RuntimeException {
  public CircularQueueException(String why){
    super(why);
  }
}
