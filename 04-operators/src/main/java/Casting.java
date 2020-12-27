/**
 * V1.0 created by wujf  on  2020-12-27
 */
public class Casting {
    public static void main(String[] args) {
        int i =200;
        System.out.println(i);
        long lng = (long)i;
        System.out.println(lng);
        lng = i;
        System.out.println(lng);
        long lng2 = (long)200;
        System.out.println(lng2);
        lng2 = 200;
        System.out.println(lng2);
        i = (int)lng2;
        System.out.println(i);
    }
}
