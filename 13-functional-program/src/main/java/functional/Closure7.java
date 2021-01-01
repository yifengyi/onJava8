package functional;

import java.util.function.IntSupplier;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class Closure7 {
    IntSupplier makeFun(int x){
        Integer i = 0;
        i = i+1;
        //return ()->x+i;
        return () -> -1;
    }
}
