package streams;

import java.util.Random;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class Randoms {
    public static void main(String[] args) {
        new Random(47)
                .ints(5,20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);
    }
}
