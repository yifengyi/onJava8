package streams;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class ImperativeRandoms {
    public static void main(String[] args) {
        Random rand = new Random(47);
        SortedSet<Integer> rints = new TreeSet<>();
        while (rints.size() < 7) {
            int r = rand.nextInt(20);
            if (5>r) {
                continue;
            }
            rints.add(r);
        }

        System.out.println(rints);
    }
}
