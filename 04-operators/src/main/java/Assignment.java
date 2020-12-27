/**
 * V1.0 created by wujf  on  2020-12-27
 */
class Thank {
    int level;
}

public class Assignment {
    public static void main(String[] args) {
        Thank t1 = new Thank();
        Thank t2 = new Thank();

        t1.level = 9;
        t2.level = 47;
        System.out.println("1:t1.level:" + t1.level + ",t2.level:" + t2.level);

        t1 = t2;

        System.out.println("2:t1.level:" + t1.level + ",t2.level:" + t2.level);

        t1.level = 27;

        System.out.println("3:t1.level:" + t1.level + ",t2.level:" + t2.level);

    }
}
