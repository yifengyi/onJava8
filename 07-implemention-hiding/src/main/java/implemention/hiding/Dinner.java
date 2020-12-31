package implemention.hiding;

import implemention.hiding.dessert.Cookie;

/**
 * 1.0v created by wujf on 2020-12-28
 */
public class Dinner {
  public static void main(String[] args) {
    Cookie x = new Cookie();
    // x.bite(); //默认访问权限 包下可见
  }
}
