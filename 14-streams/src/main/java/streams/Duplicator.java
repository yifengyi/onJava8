package streams;

import java.util.stream.Stream;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class Duplicator {
    public static void main(String[] args) {
        Stream.generate(()->"duplicate")
                .limit(3)
                .forEach(System.out::println);
    }
}
