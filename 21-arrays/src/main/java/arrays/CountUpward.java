package arrays;

import java.util.stream.LongStream;

import static onjava.ArrayShow.show;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
public class CountUpward {
    static  long[] fillCounted(int size){
        return LongStream.iterate(0,i->i+1)
                .limit(size)
                .toArray();
    }

    public static void main(String[] args) {
        long[] l1 = fillCounted(20);
        show(l1);
    }
}
