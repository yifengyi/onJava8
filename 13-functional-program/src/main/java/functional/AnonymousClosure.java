package functional;

import java.util.function.IntSupplier;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class AnonymousClosure {
    IntSupplier makeFun(int x){
        int i = 0;
        return new IntSupplier() {
            @Override
            public int getAsInt() {
                return x+i;
            }
        };
    }
}
