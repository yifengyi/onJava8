package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1.0v created by wujf on 2021-1-8
 */
public class StartEnd {
  public static String input = "As long as there is injustice, whenever a\n" +
          "Targathian baby cries out, wherever a distress\n" +
          "signal sounds among the stars " +
          "... We'll be there.\n"+
          "This fine ship, and this fine crew ...\n" +
          "Never give up! Never surrender!";

  private static class Display{
    private boolean regexPrinted = false;
    private String regex;
    Display(String regex){
      this.regex = regex;
    }
    void display(String msg){
      if (!regexPrinted) {
        System.out.println(regex);
        regexPrinted = true;
      }
      System.out.println(msg);
    }
  }
  static void examine(String s,String regex){
    Display d = new Display(regex);
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(s);

    while (m.find()) {
      d.display("find() '"+m.group()
        +"' start = "+m.start()+" end = "+m.end());
    }
    if (m.lookingAt()) {
      d.display("lookingAt() '"+m.group()
              +"' start = "+m.start()+" end = "+m.end());
    }
    if (m.matches()) {
      d.display("matches() '"+m.group()
              +"' start = "+m.start()+" end = "+m.end());
    }
  }

  public static void main(String[] args) {
    String[] regs = {"\\w*ere\\w*",
            "\\w*ever",
            "T\\w+",
            "Never.*?!"};
    for (String in : input.split("\n")) {
      System.out.println("input : " + in);
      for (String reg : regs) {
        examine(in,reg);
      }
    }
  }
}
