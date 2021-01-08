package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1.0v created by wujf on 2021-1-8
 * 命令： java strings/TestRegularExpression abcabcabcdefabc abc+
 *
 */
public class TestRegularExpression {
  public static void main(String[] args) {
    if (2>args.length) {
      System.out.println(
              "Usage:\njava TestRegularExpression " +
                      "characterSequence regularExpression+");
      System.exit(0);
    }
    System.out.println("Input: \"" + args[0] + "\"");
    for (String arg : args) {
      System.out.println("Regular expression: \"" + arg + "\"");
      Pattern p = Pattern.compile(arg);
      Matcher m = p.matcher(args[0]);
      while (m.find()) {
        System.out.println("Match \"" + m.group() + "\" at positions " +
                m.start() + "-" + (m.end() - 1));
      }
    }

  }
}
