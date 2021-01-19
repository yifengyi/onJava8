package annotations.simplest;

/**
 * 1.0v created by wujf on 2021-1-19
 * cd 23-annotations\target\classes
 * javac  -processor annotations.simplest.SimpleProcessor  ..\..\src\main\java\annotations\simplest\SimpleTest.java
 */
@Simple
public class SimpleTest {
  @Simple
  int i;

  @Simple
  public SimpleTest() {
  }

  @Simple
  public void foo() {
    System.out.println("SimpleTest.foo()");
  }

  @Simple
  public void bar(String s,int i ,float f){
    System.out.println("SimpleTest.bar()");
  }

  @Simple
  public static void main(String[] args) {
    @Simple
    SimpleTest st = new SimpleTest();
    st.foo();
  }
}
