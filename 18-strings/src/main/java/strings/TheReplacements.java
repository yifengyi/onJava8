package strings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 1.0v created by wujf on 2021-1-8
 */
public class TheReplacements {
  public static void main(String[] args) throws IOException {
    Path p =
            Paths.get("src", "main", "java", "strings", "TheReplacements.java");

    String s =
            Files.lines(p).collect(Collectors.joining("\n"));
    Matcher mInput = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s);

    if (mInput.find()) {
      s = mInput.group(1);
    }
    s = s.replaceAll(" {2,}"," ");

    s = s.replaceAll("(?m)^ +","");
    System.out.println(s);

    s = s.replaceFirst("[aeiou]","(VOWEL1)");
    StringBuffer sbuf = new StringBuffer();
    Pattern pat = Pattern.compile("[aeiou]");
    Matcher m = pat.matcher(s);
    while (m.find()) {
      m.appendReplacement(sbuf, m.group().toLowerCase());
    }
    m.appendTail(sbuf);
    System.out.println(sbuf);
  }
}
