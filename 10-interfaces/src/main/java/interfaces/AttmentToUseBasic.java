package interfaces;

/**
 * 1.0v created by wujf on 2020-12-29
 */
abstract class Basic {
  abstract void unimplemented();
}
abstract class  Basic2 extends  Basic{
  int f(){
    return 11;
  }
  abstract  void g();
}
public class AttmentToUseBasic{
  // interfaces.Basic b = new interfaces.Basic() ; //抽象类不能实例化
}