package generics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
public class Apply {
    public static <T,S extends Iterable<T>> void apply(S seq , Method f,Object ...args){
        try {
            for (T t : seq) {
                f.invoke(t, args);
            }
        } catch (IllegalAccessException
                | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}

