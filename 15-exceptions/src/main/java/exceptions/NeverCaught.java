package exceptions;

/**
 * V1.0 created by wujf  on  2021-01-02
 */
public class NeverCaught {
    static void f(){
        throw new RuntimeException("From f()");
    }
    static void g(){
        f();
    }

    public static void main(String[] args) {
        g();
    }
}
