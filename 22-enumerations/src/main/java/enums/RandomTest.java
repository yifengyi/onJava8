package enums;

import onjava.Enums;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
enum Activity{
    SITTING,LYING,STANDING,HOPPING,
    RUNNING,DODGING,JUMPING,FALLING,FLYING
}
public class RandomTest {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(Enums.random(Activity.class) + " ");
        }
    }
}
