package exceptions;

/**
 * V1.0 created by wujf  on  2021-01-04
 */
class Reporter implements AutoCloseable{
    String name = getClass().getSimpleName();

    public Reporter() {
        System.out.println("Creating " + name);
    }

    @Override
    public void close() {
        System.out.println("Closing " + name);
    }
}
class First extends Reporter{}
class Second extends Reporter{}
public class AutoCloseableDetails {
    public static void main(String[] args) {
        try (
                First f = new First();
                Second s = new Second()
                ){
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
