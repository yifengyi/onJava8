package validating;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 1.0v created by wujf on 2021-1-6
 */
public class CircularQueueTest {
  private CircularQueue queue = new CircularQueue(10);

  private int i = 0;

  @BeforeEach
  public void initialize(){
    while (5 > i) {
      queue.put(Integer.toString(i++));
    }
  }
  private void showFullness(){
    Assertions.assertTrue(queue.full());
    Assertions.assertFalse(queue.empty());
    System.out.println(queue.dump());
  }
  private void showEmptiness(){
    Assertions.assertFalse(queue.full());
    Assertions.assertTrue(queue.empty());
    System.out.println(queue.dump());
  }
  @Test
  public void full(){
    System.out.println("testFull");
    System.out.println(queue.dump());
    System.out.println(queue.get());
    System.out.println(queue.get());
    while (!queue.full()) {
      queue.put(Integer.toString(i++));

    }
    String msg = "";
    try {
      queue.put("");
    } catch (CircularQueueException e) {
      msg = e.getMessage();
      System.out.println(msg);
    }
    Assertions.assertEquals(msg,"put() into full CircularQueue");
    showFullness();
  }

  @Test
  public void empty(){
    System.out.println("testEmpty");
    while (!queue.empty()) {
      System.out.println(queue.get());
    }
    String msg  = "";
    try {
      queue.get();
    } catch (CircularQueueException e) {
      msg = e.getMessage();
      System.out.println(msg);
    }
    Assertions.assertEquals(msg,"get() from empty CircularQueue");
    showEmptiness();
  }

  @Test
  public void nullPut(){
    System.out.println("testNullPut");
    String msg = "";
    try {
      queue.put(null);
    } catch (CircularQueueException e) {
      msg = e.getMessage();
      System.out.println(msg);
    }
    Assertions.assertEquals(msg,"put() null item");
  }
  @Test
  public void circularity(){
    System.out.println("testCircularity");
    while (!queue.full()) {
      queue.put(Integer.valueOf(i++));
    }
    showFullness();
    Assertions.assertTrue(queue.isWrapped());

    while (!queue.empty()) {
      System.out.println(queue.get());
    }
    showEmptiness();
    while (!queue.full()) {
      queue.put(Integer.toString(i++));
    }
    showFullness();
    while (!queue.empty()) {
      System.out.println(queue.get());
    }
    showEmptiness();
  }
}
