package inner;

/**
 * 1.0v created by wujf on 2020-12-30
 */
public class TestBed {
  public void f(){
    System.out.println("f()");
  }

  public static class Tester{
    public static void main(String[] args) {
      TestBed t = new TestBed();
      t.f();
    }
  }
}
