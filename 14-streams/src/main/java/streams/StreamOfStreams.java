package streams;

import java.util.stream.Stream;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class StreamOfStreams {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .map(i -> Stream.of("Gonzo", "Kermit", "Beakr"))
                .map(e -> e.getClass().getName())
                .forEach(System.out::println);
    }
}
