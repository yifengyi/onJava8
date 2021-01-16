package generics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
public class ListOfInt {
    public static void main(String[] args) {
        List<Integer> li = IntStream.range(38,48)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(li);
    }
}
