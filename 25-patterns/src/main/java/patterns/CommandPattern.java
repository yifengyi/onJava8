package patterns;

import java.util.Arrays;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class CommandPattern {
  public static void main(String[] args) {
    List<Runnable> macro = Arrays.asList(
            ()->System.out.print("Hello "),
            ()->System.out.print("word! "),
            ()->System.out.print("I'm the command pattern!")
    );
    macro.forEach(Runnable::run);
  }
}
