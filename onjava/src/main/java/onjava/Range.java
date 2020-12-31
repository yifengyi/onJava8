package onjava;

/**
 * V1.0 created by wujf  on  2020-12-27
 */
public class Range {
    public static int[] rang(int n){
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }

        return result;
    }

    public static int[] rang(int start,int end){
        int sz = end - start;
        int[] result = new int[sz];
        for (int i = 0; i < sz; i++) {
            result[i]=start +i;
        }
        return result;
    }

    public static int[] rang(int start,int end,int step){
        int sz = (end-start)/step;
        int[] result = new int[sz];
        for (int i = 0; i < sz; i++) {
            result[i]=start + (i*step);
        }
        return result;
    }
}
