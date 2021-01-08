package strings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1.0v created by wujf on 2021-1-8
 */
public class JGrep {
  public static void main(String[] args) throws IOException {
    if (2>args.length) {
      System.out.println("Usage: java JGrep file regex");
      System.exit(0);
    }

    Pattern p = Pattern.compile(args[1]);
    int index = 0;
    Matcher m = p.matcher("");
    Path pat = Paths.get(args[0]);
    for (String line : Files.readAllLines(pat)) {
      m.reset(line);
      while (m.find()) {
        System.out.println(index + ": " + m.group() + ": " + m.start());
      }
    }
  }
}
