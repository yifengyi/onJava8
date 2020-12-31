package collections;

import onjava.Stack;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public class StackTest2 {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    for (String s : "My dog has fleas".split(" ")) {
      stack.push(s);
    }
    while (!stack.isEmpty()) {
      System.out.print(stack.pop() + " ");
    }
  }
}
