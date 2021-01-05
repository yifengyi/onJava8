package validating;

import java.util.ArrayList;

/**
 * 1.0v created by wujf on 2021-1-5
 */
public class CountedList extends ArrayList<String> {
  private static int counter = 0;
  private int id = counter++;

  public CountedList() {
    System.out.println("CountedList # " + id);
  }

  public int getId() {
    return id;
  }
}
