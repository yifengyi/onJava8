package arrays;

import onjava.ArrayShow;

import java.util.Arrays;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
class Bob{
    final int id;
    Bob(int n){
        id =n;
    }

    @Override
    public String toString() {
        return "Bob" + id;
    }
}
public class SimpleSetAll {
    public static final int SZ = 8;
    static int val =1;
    static char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    static char getChar(int n){
        return chars[n];
    }

    public static void main(String[] args) {
        int[] ia = new int[SZ];
        long[] la = new long[SZ];
        double[] da = new double[SZ];

        Arrays.setAll(ia, n -> n);
        Arrays.setAll(la, n -> n);
        Arrays.setAll(da, n -> n);
        ArrayShow.show(ia);
        ArrayShow.show(la);
        ArrayShow.show(da);

        Arrays.setAll(ia,n->val++);
        Arrays.setAll(la,n->val++);
        Arrays.setAll(da,n->val++);
        ArrayShow.show(ia);
        ArrayShow.show(la);
        ArrayShow.show(da);

        Bob[] ba = new Bob[SZ];
        Arrays.setAll(ba,Bob::new);
        ArrayShow.show(ba);

        Character[] ca = new Character[SZ];
        Arrays.setAll(ca,SimpleSetAll::getChar);
        ArrayShow.show(ca);


    }
}
