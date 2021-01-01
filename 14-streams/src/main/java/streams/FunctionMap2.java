package streams;

import java.util.stream.Stream;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
class Numbered{
    final int n;

    public Numbered(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Numbered(" + n + ")";
    }
}
public class FunctionMap2 {
    public static void main(String[] args) {
        Stream.of(1,5,7,9,11,13)
                .map(Numbered::new)
                .forEach(System.out::println);
    }
}
