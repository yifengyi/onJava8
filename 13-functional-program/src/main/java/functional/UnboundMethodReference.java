package functional;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
class X{
    String f(){
        return "X::f()";
    }
}
interface MakeString{
    String make();
}
interface TransformX{
    String transform(X x);
}

public class UnboundMethodReference {
    public static void main(String[] args) {
        //MakeString ms = X::f;//函数签名不一致
        TransformX xp = X::f;
        X x = new X();
        System.out.println(xp.transform(x));
        System.out.println(x.f());
    }
}
