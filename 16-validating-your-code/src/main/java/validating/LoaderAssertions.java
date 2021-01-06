package validating;

/**
 * 1.0v created by wujf on 2021-1-6
 */
class Loaded{
  public void go(){
    assert false : "Loaded.go";
  }
}
public class LoaderAssertions {
  public static void main(String[] args) {
    ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
    new Loaded().go();
  }
}
