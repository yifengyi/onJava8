package arrays;

import onjava.ArrayShow;

import java.util.SplittableRandom;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
public class IceCreamFlavors {
    private static SplittableRandom rand =
            new SplittableRandom(47);

    static final String[] FLAVORS={
            "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
            "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
            "Praline Cream", "Mud Pie"
    };
    public static String[] flavorSet(int n){
        if (n>FLAVORS.length) {
            throw new IllegalArgumentException("Set too big");
        }
        String[] res = new String[n];
        boolean[] picked = new boolean[FLAVORS.length];
        for (int i = 0; i < n; i++) {
            int t ;
            do {
                t = rand.nextInt(FLAVORS.length);
            } while (picked[t]);
            res[i] = FLAVORS[t];
            picked[t]=true;
        }
        return res;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            ArrayShow.show(flavorSet(3));
        }
    }
}
