package streams;

/**
 * V1.0 created by wujf  on  2021-01-02
 */
public class NumericStreamInfo {
    public static void main(String[] args) {
        System.out.println(RandInts.rands().average().getAsDouble());
        System.out.println(RandInts.rands().max().getAsInt());
        System.out.println(RandInts.rands().min().getAsInt());
        System.out.println(RandInts.rands().sum());
        System.out.println(RandInts.rands().summaryStatistics());
    }
}
