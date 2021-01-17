package arrays;

import java.util.Arrays;
import java.util.SplittableRandom;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
public class RaggedArray {
    static int val = 1;

    public static void main(String[] args) {
        SplittableRandom rand = new SplittableRandom(47);
        int[][][] a = new int[rand.nextInt(7)][][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[rand.nextInt(5)][];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = new int[rand.nextInt(5)];
                Arrays.setAll(a[i][j],n->val++);
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
