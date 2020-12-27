import java.util.Random;

/**
 * V1.0 created by wujf  on  2020-12-27
 */
public class ForInFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float[] f = new float[10];
        for (int i = 0; i < 10; i++) {
            f[i] = rand.nextFloat();
        }
        for (float x : f) {
            System.out.println(x);
        }
    }
}
