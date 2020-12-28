package hiding.cookie2;

/**
 * 1.0v created by wujf on 2020-12-28
 */
public class ChocolateChip2 extends Cookie {
  public ChocolateChip2(){
    System.out.println("ChocolateChip2 constructor");
  }
  public void chomp(){
    bite();
  }

  public static void main(String[] args) {
    ChocolateChip2 x = new ChocolateChip2();
    x.chomp();
  }
}
