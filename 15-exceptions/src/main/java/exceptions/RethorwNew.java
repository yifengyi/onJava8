package exceptions;

/**
 * V1.0 created by wujf  on  2021-01-02
 */
class OneException extends Exception{
    OneException(String s){
        super(s);
    }
}
class TwoException extends Exception{
    public TwoException(String message) {
        super(message);
    }
}
public class RethorwNew {
    public static void f()throws OneException{
        System.out.println("originating the exception in f()");
        throw new OneException("throw from f()");
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println("Caught in inner try,e.printStackTrace()");
                e.printStackTrace(System.out);
                throw new TwoException("from inner try");
            }
        } catch (TwoException e) {
            System.out.println("Caught in outer try,e.printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}
