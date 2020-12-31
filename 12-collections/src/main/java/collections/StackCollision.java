package collections;



/**
 * 1.0v created by wujf on 2020-12-31
 */
public class StackCollision {
  public static void main(String[] args) {
    onjava.Stack<String> stack = new onjava.Stack<>();
    for (String s : "My dog has fleas".split(" ")) {
      stack.push(s);
    }
    while (!stack.isEmpty()) {
      System.out.print(stack.pop() + " ");
    }
    System.out.println();
    java.util.Stack<String> stack2 = new java.util.Stack<>();
    for (String s : "My dog has fleas".split(" ")) {
      stack2.push(s);
    }
    while (!stack2.isEmpty()) {
      System.out.print(stack2.pop() + " ");
    }
  }
}
