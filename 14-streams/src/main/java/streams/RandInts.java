package streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * V1.0 created by wujf  on  2021-01-02
 */
public class RandInts {
    private static int[] rints
            = new Random(47)
            .ints(0, 1000)
            .limit(100)
            .toArray();

    public static IntStream rands(){
        return Arrays.stream(rints);
    }
}
