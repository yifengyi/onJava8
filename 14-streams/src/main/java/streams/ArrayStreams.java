package streams;

import java.util.Arrays;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class ArrayStreams {
    public static void main(String[] args) {
        Arrays.stream(new double[]{3.14159, 2.718, 1.618})
                .forEach(n -> System.out.format("%f ", n));
        System.out.println();

        Arrays.stream(new int[]{1, 4, 5})
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();

        Arrays.stream(new long[]{11, 22, 44 , 66})
                .forEach(n -> System.out.format("%d ", n));
        System.out.println();

    //    切片
        Arrays.stream(new int[]{1, 3, 5, 7, 15, 28, 49}, 3, 6)
                .forEach(n -> System.out.format("%d ", n));

    }
}
