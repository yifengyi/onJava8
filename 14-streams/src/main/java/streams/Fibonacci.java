package streams;

import java.util.stream.Stream;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class Fibonacci {
    int x = 1;

    Stream<Integer> numbers(){
        return Stream.iterate(0,i->{
            int result = x+i;
            x = i;
            return result;
        });
    }

    public static void main(String[] args) {
        new Fibonacci().numbers()
                .skip(20)
                .limit(10)
                .forEach(System.out::println);

    }
}
