package operators;

import java.util.Random;

/**
 * V1.0 created by wujf  on  2020-12-27
 */
public class Bool {
    public static void main(String[] args){
        Random ran = new Random();

        int i = ran.nextInt(100);
        int j = ran.nextInt(100);

        System.out.println("i=" + i);
        System.out.println("j= " + j);
        System.out.println("i>j is " + (i > j));
        System.out.println("i<j is " + (i < j));
        System.out.println("i>=j is " + (i >= j));
        System.out.println("i<=j is " + (i <= j));
        System.out.println("i == j is " + (i == j));
        System.out.println("i != j  is " + (i != j));

        //
        System.out.println("(i <10) && (j<10) is  " + ((i < 10) && (j < 10)));
        System.out.println("(i <10) || (j<10) is  " + ((i < 10) || (j < 10)));

    }
}
