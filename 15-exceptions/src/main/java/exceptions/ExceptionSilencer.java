package exceptions;

/**
 * V1.0 created by wujf  on  2021-01-02
 */
public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            return;
        }
    }
}
