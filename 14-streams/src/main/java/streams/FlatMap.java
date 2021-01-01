package streams;

import java.util.stream.Stream;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class FlatMap {
    public static void main(String[] args) {
        Stream.of(1,2,3)
                .flatMap(i->Stream.of("Gonzo","Fozzie","Beaker"))
                .forEach(System.out::println);
    }
}
