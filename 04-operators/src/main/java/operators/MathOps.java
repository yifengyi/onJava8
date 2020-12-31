package operators;

import java.util.Random;

/**
 * V1.0 created by wujf  on  2020-12-27
 */
public class MathOps {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i, j, k;

        j = rand.nextInt(100) + 1;
        System.out.println("j: " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k: " + k);
        i = j + k;
        System.out.println("j+k : " + i);
        i = j - k;
        System.out.println("j-k :" + i);
        i = k / j;
        System.out.println("k/j:" + i);
        i = k * j;
        System.out.println("k*j:" + i);
        i = k % j;
        System.out.println("k%j:" + i);
        j %= k;
        System.out.println("j %=k :" + j);

    //    浮点数计算
        float u,v,w;
        v = rand.nextFloat();
        System.out.println("v: "+v);
        w = rand.nextFloat();
        System.out.println("w:"+w);

        u = v+w;
        System.out.println("v+w:"+u);
        u = v-w;
        System.out.println("v-w:"+ u);
        u = v*w;
        System.out.println("v*w:"+u);
        u = v/w;
        System.out.println("v/w:"+u);
        u +=v;
        System.out.println("u+=v:"+u);
        u -=v;
        System.out.println("u-=v:"+u);
        u *=v;
        System.out.println("u *=v:"+u);
        u /=v;
        System.out.println("u/=v:"+u);


    }
}
