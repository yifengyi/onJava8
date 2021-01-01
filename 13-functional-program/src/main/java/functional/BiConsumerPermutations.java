package functional;

import java.util.function.BiConsumer;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class BiConsumerPermutations {
    static BiConsumer<Integer, Double> bicid = (i, d) ->
            System.out.printf("%d,%f%n", i, d);
    static BiConsumer<Double, Integer> bicdi = (d, i) ->
            System.out.printf("%d,%f%n", i, d);
    static BiConsumer<Integer, Long> bicil = (i, l) ->
            System.out.printf("%d,%d%n", i, l);

    public static void main(String[] args) {
        bicid.accept(47, 11.24);
        bicdi.accept(111.11,93);
        bicil.accept(1, 11L);
    }
}
