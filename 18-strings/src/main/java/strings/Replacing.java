package strings;

/**
 * 1.0v created by wujf on 2021-1-8
 */
public class Replacing {
  static String s = Splitting.knights;

  public static void main(String[] args) {
    System.out.println(s.replaceFirst("f\\w+", "located"));
    System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
  }
}
