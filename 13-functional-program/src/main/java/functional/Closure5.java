package functional;

import java.util.function.IntSupplier;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class Closure5 {
    IntSupplier makeFun(int x){
        int i= 0;
        i++;
        x++;
        //return ()->x+i;
        return ()->0;
    }
}
