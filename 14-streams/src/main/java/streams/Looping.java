package streams;

import onjava.Repeat;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class Looping {
    static void hi(){
        System.out.println("Hi!");
    }

    public static void main(String[] args) {
        Repeat.repeat(3, () -> System.out.println("Looping!"));
        Repeat.repeat(2,Looping::hi);
    }
}
