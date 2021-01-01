package functional;

import java.util.function.IntSupplier;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class Closure2 {
    IntSupplier makeFun(int x){
        int i = 0;
        return ()->x+i;
    }
}
