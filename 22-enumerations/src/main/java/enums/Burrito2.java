package enums;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
public class Burrito2 {
    SpicinessEnum degree;

    public Burrito2(SpicinessEnum degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Burrito is " + degree;
    }

    public static void main(String[] args) {
        System.out.println(new Burrito2(SpicinessEnum.NOT));
        System.out.println(new Burrito2(SpicinessEnum.MEDIUM));
        System.out.println(new Burrito2(SpicinessEnum.HOT));
    }
}
