package strings;

/**
 * 1.0v created by wujf on 2021-1-8
 */
public class Rudolph {
  public static void main(String[] args) {
    String[] str = {
            "Rudolph",
            "[rR]udolph",
            "[rR][aeiou][a-z]ol.*",
            "R.*"
    };

    for (String s : str) {
      System.out.println("Rudolph".matches(s));
    }
  }
}
