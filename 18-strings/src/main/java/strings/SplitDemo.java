package strings;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * 1.0v created by wujf on 2021-1-8
 */
public class SplitDemo {
  public static void main(String[] args) {
    String input =
            "This!!unusual use!!of exclamation!!points";
    System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
    System.out.println(Arrays.toString(Pattern.compile("!!").split(input, 3)));

  }
}
