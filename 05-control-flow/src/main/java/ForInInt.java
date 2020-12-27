/**
 * V1.0 created by wujf  on  2020-12-27
 */
public class ForInInt {
    public static void main(String[] args) {
        for (int i : Range.rang(10)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : Range.rang(5, 10)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : Range.rang(5, 20, 3)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : Range.rang(20, 5, -3)) {
            System.out.print(i + " ");
        }
        System.out.println();


    }
}
