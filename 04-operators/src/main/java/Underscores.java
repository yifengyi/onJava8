/**
 * 1. 仅限单 _，不能多条相连。
 * 2. 数值开头和结尾不允许出现 _。
 * 3. F、D 和 L 的前后禁止出现 _。
 * 4. 二进制前导 b 和十六进制 x 前后禁止出现 _。
 * V1.0 created by wujf  on  2020-12-27
 */
public class Underscores {
    public static void main(String[] args) {
        double d = 341_435_936.445_667;
        System.out.println(d);
        int bin = 0b0010_1111_1010_1111_1010_1111_1010_1111;
        System.out.println(Integer.toBinaryString(bin));
        System.out.printf("%x%n", bin);
        long hex = 0x7f_e9_b7_aa;
        System.out.printf("%x%n",hex);
    }
}
