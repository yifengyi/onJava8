package arrays;

import onjava.Rand;

import java.util.Arrays;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
public class ParallelSetAll {
    static final int SIZE = 10_000_000;

    static void intArray(){
        int[] ia = new int[SIZE];
        Arrays.setAll(ia,new Rand.Pint()::get);
        Arrays.parallelSetAll(ia,new Rand.Pint()::get);

    }
    static void longArray(){
        long[] la = new long[SIZE];
        Arrays.setAll(la,new Rand.Plong()::get);
        Arrays.parallelSetAll(la,new Rand.Plong()::get);
    }

    public static void main(String[] args) {
        intArray();
        longArray();
    }
}
