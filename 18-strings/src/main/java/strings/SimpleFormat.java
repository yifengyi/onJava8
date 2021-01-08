package strings;

/**
 * 1.0v created by wujf on 2021-1-8
 */
public class SimpleFormat {
  public static void main(String[] args) {
    int x= 5;
    double y = 5.332542;
    System.out.println("Row 1:["+x+" "+y+"]");
    System.out.format("Row 1:[%d %f]%n", x, y);
    System.out.printf("Row 1:[%d %f]%n",x,y);
  }
}
