package strings;

import java.util.Random;
import java.util.stream.Collectors;

/**
 * 1.0v created by wujf on 2021-1-8
 */
public class UsingStringBuilder {
  public static String string1(){
    Random rand = new Random(47);
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < 25; i++) {
      sb.append(rand.nextInt(100));
      sb.append(", ");
    }
    sb.delete(sb.length() - 2, sb.length());
    sb.append("]");
    return sb.toString();
  }

  public static String string2(){
    String res = new Random(47)
            .ints(25, 0, 100)
            .mapToObj(Integer::toString)
            .collect(Collectors.joining(", "));

    return "[" + res + "]";
  }

  public static void main(String[] args) {
    System.out.println(string1());
    System.out.println(string2());
  }
}
