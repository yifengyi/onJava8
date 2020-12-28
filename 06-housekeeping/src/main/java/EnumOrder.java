/**
 * 1.0v created by wujf on 2020-12-28
 */
public class EnumOrder {
  public static void main(String[] args) {
    for (Spiciness spiciness : Spiciness.values()) {
      System.out.println(spiciness + ", ordinal " + spiciness.ordinal());
    }
  }
}
