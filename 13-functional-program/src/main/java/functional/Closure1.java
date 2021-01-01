package functional;

import java.util.function.IntSupplier;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class Closure1 {
    int i;
    IntSupplier makeFun(int x){
        return ()->x+ i++;
    }
}
