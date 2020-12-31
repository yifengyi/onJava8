package inner; /**
 * 1.0v created by wujf on 2020-12-30
 */
public interface ClassInInterface {
  void howdy();
  class Test implements ClassInInterface{
    @Override
    public void howdy() {
      System.out.println("Howdy!");
    }

    public static void main(String[] args) {
      new Test().howdy();
    }
  }
}
