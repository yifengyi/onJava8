package arrays;

import java.util.Arrays;
import java.util.SplittableRandom;

import static onjava.ArrayShow.show;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
public class CompType implements Comparable<CompType> {
    private static int count = 1;
    private static SplittableRandom r = new SplittableRandom(47);
    int i;
    int j;

    public CompType(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public static CompType get() {
        return new CompType(r.nextInt(100), r.nextInt(100));
    }

    @Override
    public String toString() {
        String res = "[i = " + i + ",j = " + j + "]";
        if (count++ % 3 == 0) {
            res += "\n";
        }
        return res;
    }

    @Override
    public int compareTo(CompType o) {
        return (i < o.i ? -1 : (i == o.i ? 0 : 1));
    }

    public static void main(String[] args) {
        CompType[] a = new CompType[12];
        Arrays.setAll(a,n->get());
        show("Before sorting", a);
        Arrays.sort(a);
        show("After sorting", a);

    }
}
