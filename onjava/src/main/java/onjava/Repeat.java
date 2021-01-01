package onjava;

import java.util.stream.IntStream;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class Repeat {
    public static void repeat(int n,Runnable action){
        IntStream.range(0,n).forEach(i->action.run());
    }
}
