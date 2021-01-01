package functional;

import java.util.function.BiConsumer;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
class In1{}
class In2{}
public class MethodConversion {
    static void accept(In1 i1,In2 i2){
        System.out.println("accept()");
    }
    static void someOtherName(In1 i1,In2 i2){
        System.out.println("someOtherName()");
    }

    public static void main(String[] args) {
        BiConsumer<In1,In2> bic ;

        bic = MethodConversion::accept;
        bic.accept(new In1(),new In2());

        bic = MethodConversion::someOtherName;

        //bic.someOtherName(new In1(),new In2());
        bic.accept(new In1(),new In2());
    }
}
