package collections;

import java.util.Map;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public class EnvironmentVariables {
  public static void main(String[] args) {
    for(Map.Entry entry: System.getenv().entrySet()) {
      System.out.println(entry.getKey() + ": " +
              entry.getValue());
    }
  }
}
