package streams;

import onjava.Operations;

import java.util.Arrays;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class Machine2 {
    public static void main(String[] args) {
        Arrays.stream(new Operations[]{
                ()->Operations.show("Bing"),
                ()->Operations.show("Crack"),
                ()->Operations.show("Twist"),
                ()->Operations.show("Pop")
        }).forEach(Operations::execute);
    }
}
