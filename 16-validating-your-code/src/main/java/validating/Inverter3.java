package validating;

import static java.lang.Character.*;

/**
 * 1.0v created by wujf on 2021-1-6
 */
public class Inverter3 implements StringInverter {
  public String invert(String str) {
    if (str.length() > 30)
      throw new RuntimeException("argument too long!");
    String result = "";
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      result += isUpperCase(c) ?
              toLowerCase(c) :
              toUpperCase(c);
    }
    return result;
  }
}