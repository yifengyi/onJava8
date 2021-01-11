package typeinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * 1.0v created by wujf on 2021-1-11
 * java typeinfo.ShowMethods typeinfo.ShowMethods
 */
public class ShowMethods {
  private static String useage = "usage:\n" +
          "ShowMethods qualified.class.name\n" +
          "To show all methods in class or:\n" +
          "ShowMethods qualified.class.name word\n" +
          "To search for methods involving 'word'";
  private static Pattern p = Pattern.compile("\\w+\\.");

  public static void main(String[] args) {
    if (1>args.length) {
      System.out.println(useage);
      System.exit(0);
    }
    int lines = 0;

    try {
      Class<?> c = Class.forName(args[0]);
      Method[] methods = c.getMethods();
      Constructor[] ctors = c.getConstructors();
      if (args.length == 1) {
        for (Method method : methods) {
          System.out.println(
                  p.matcher(
                          method.toString()).replaceAll(""));
        }
        for (Constructor ctor : ctors) {
          System.out.println(
                  p.matcher(
                          ctor.toString()).replaceAll(""));
        }
        lines = methods.length+ctors.length;
      }else{
        for (Method method : methods) {
          if (method.toString().contains(args[1])) {
            System.out.println(
                    p.matcher(
                            method.toString()).replaceAll(""));
            lines++;
          }
        }
        for (Constructor ctor : ctors) {
          if (ctor.toString().contains(args[1])) {
            System.out.println(
                    p.matcher(
                            ctor.toString()).replaceAll(""));
            lines++;
          }
        }
      }
    } catch (ClassNotFoundException e) {
      System.out.println("No such class: " + e);
    }

  }

}
