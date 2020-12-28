/**
 * 1.0v created by wujf on 2020-12-28
 */
public class OverloadingVarargs2 {
  static void f(float i,Character ... args){
    System.out.println("first");
  }
  static void f(Character ... args){
    System.out.println("second");
  }

  public static void main(String[] args) {
    /*Error:(14, 5) java: 对f的引用不明确
    OverloadingVarargs2 中的方法 f(float,java.lang.Character...)
    和 OverloadingVarargs2
    中的方法 f(java.lang.Character...) 都匹配*/
    // f(1,'a');
    // f('a', 'b');
  }
}
