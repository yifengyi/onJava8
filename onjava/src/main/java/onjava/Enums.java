package onjava;

import java.util.Random;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
public class Enums {
    private static Random rand = new Random(47);
    public static <T extends Enum<T>>T random(Class<T> ec){
        return random(ec.getEnumConstants());
    }

    public static <T> T random(T[] values){
        return values[rand.nextInt(values.length)];
    }
}
