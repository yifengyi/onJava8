package functional;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class CurriedIntAdd {
    public static void main(String[] args) {
        IntFunction<IntUnaryOperator>
                curriedIntAdd = a->b->a+b;
        IntUnaryOperator add4 = curriedIntAdd.apply(4);
        System.out.println(add4.applyAsInt(5));
    }
}
