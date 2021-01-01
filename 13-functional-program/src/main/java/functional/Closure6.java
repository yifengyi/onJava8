package functional;

import java.util.function.IntSupplier;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class Closure6 {
    IntSupplier makeFun(int x){
        int i= 0;
        x++;
        i++;
        final int iFinal = i;
        final int xFinal = x;
        return ()->xFinal+iFinal;
    }
}
