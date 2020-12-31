package operators;

/**
 * V1.0 created by wujf  on  2020-12-27
 */
class Letter {
    char c;
}

public class PassObject {
    static void f(Letter l) {
        l.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c:" + x.c);
        f(x);
        System.out.println("2: x.c:" + x.c);
    }
}
