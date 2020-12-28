import hiding.dessert.Cookie;

/**
 * 1.0v created by wujf on 2020-12-28
 */
public class ChocolateChip extends Cookie {
  public ChocolateChip(){
    System.out.println("ChocolateChip constructor");
  }
  public void chomp(){
    // bite();
  }

  public static void main(String[] args) {
    ChocolateChip x = new ChocolateChip();
    x.chomp();
  }
}
