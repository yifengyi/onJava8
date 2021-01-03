package exceptions;

/**
 * V1.0 created by wujf  on  2021-01-02
 */
public class MultiCatch {
    void x() throws Except1, Except2, Except3, Except4 {
    }

    void process() {
    }

    void f() {
        try {
            x();
        } catch (Except1 | Except2 | Except3 | Except4 except1) {
            process();
        }
    }

    void f2() {
        try {
            x();
        } catch (Except1 | Except2 except1) {
            process();
        } catch (Except3 | Except4 e) {
            process2();
        }
    }

    void process2() {

    }
}
