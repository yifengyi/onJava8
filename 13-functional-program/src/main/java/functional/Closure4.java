package functional;

import java.util.function.IntSupplier;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class Closure4 {
    IntSupplier makeFun(final int x){
        final int i = 0;
        return ()-> x+i;
    }
}
