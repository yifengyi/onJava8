package collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public class StackTest {
  public static void main(String[] args) {
    Deque<String> stack = new ArrayDeque<>();
    for (String s : "My dog has fleas".split(" ")) {
      stack.push(s);
    }
    while (!stack.isEmpty()) {
      System.out.print(stack.pop() + " ");
    }
  }
}
