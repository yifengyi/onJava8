package interfaces;

/**
 * 1.0v created by wujf on 2020-12-29
 */
interface AnInterface{
  void firstMethod();
  void secondMethod();
}
public class AnImplementation implements AnInterface {
  @Override
  public void firstMethod() {
    System.out.println("firstMethod");
  }

  @Override
  public void secondMethod() {
    System.out.println("secondMethod");
  }

  public static void main(String[] args) {
    AnInterface i = new AnImplementation();
    i.firstMethod();
    i.secondMethod();
  }
}
