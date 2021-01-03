package exceptions;

/**
 * V1.0 created by wujf  on  2021-01-02
 */
class VeryImportantException extends Exception{
    @Override
    public String toString() {
        return "A very import exception!";
    }
}
class HoHumException extends Exception{
    @Override
    public String toString() {
        return "A trivial exception";
    }
}
public class LostMessage {
    void f() throws VeryImportantException{
        throw new VeryImportantException();
    }
    void dispose()throws HoHumException{
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                lm.dispose();
            }
        } catch (VeryImportantException |HoHumException e) {
            System.out.println(e);
        }
    }

}
