package operators;

import java.util.Random;

/**
 * V1.0 created by wujf  on  2020-12-27
 */
public class BitManipulation {

    static void printBinaryInt(String s ,int i){
        System.out.println(s + ", int: "
                + i + ",binary:\n"
                + Integer.toBinaryString(i));
    }

    static void printBinaryLong(String s ,long l){
        System.out.println(s + ",long: "
                + l + ",binary:\n" + Long.toBinaryString(l));
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        int i =random.nextInt();
        int j = random.nextInt();

        printBinaryInt("-1",-1);
        printBinaryInt("+1",+1);
        int maxpos = 2147483647;
        printBinaryInt("maxpos",maxpos);
        int maxneg =-2147483648;
        printBinaryInt("maxneg",maxneg);
        printBinaryInt("i",i);
        printBinaryInt("~i",~i);
        printBinaryInt("-i",-i);
        printBinaryInt("j",j);
        printBinaryInt("i & j",i &j);
        printBinaryInt("i | j",i|j);
        printBinaryInt("i^j",i^j);
        printBinaryInt("i<<5",i<<5);
        printBinaryInt("i>>5",i>>5);
        printBinaryInt("(~i)>>5",(~i)>>5);
        printBinaryInt("i>>>5",i>>>5);
        printBinaryInt("(~i)>>>5",(~i)>>>5);
        long l = random.nextLong();
        long m = random.nextLong();
        printBinaryLong("-1l", -1l);
        printBinaryLong("+1L", +1L);

        long l1 = 9223372036854775807L;
        printBinaryLong("maxpos",l1);
        long l1n = -9223372036854775808L;
        printBinaryLong("maxneg",l1n);
        printBinaryLong("l",l);
        printBinaryLong("~l",~l);
        printBinaryLong("-l",-l);
        printBinaryLong("m",m);
        printBinaryLong("l & m",l&m);
        printBinaryLong("l | m",l|m);
        printBinaryLong("l ^ m",l^m);
        printBinaryLong("l << 5",l<<5);
        printBinaryLong("l >> 5",l>>5);
        printBinaryLong("(~l) >> 5",(~l)>>5);
        printBinaryLong("l >>> 5",l >>> 5);
        printBinaryLong("(~l) >>> 5",(~l)>>>5);


    }
}
