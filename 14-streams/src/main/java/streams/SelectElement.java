package streams;

/**
 * V1.0 created by wujf  on  2021-01-02
 */
public class SelectElement {
    public static void main(String[] args) {
        System.out.println(RandInts.rands().findFirst().getAsInt());
        System.out.println(RandInts.rands().parallel().findFirst().getAsInt());
        System.out.println(RandInts.rands().findAny().getAsInt());
        System.out.println(RandInts.rands().parallel().findAny().getAsInt());
    }
}
