package functional;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
class Go{
    static void go(){
        System.out.println("Go::go()");
    }
}
public class RunableMethodReference {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous");
            }
        }).start();

        new Thread(() -> System.out.println("lambda")).start();

        new Thread(Go::go).start();
    }
}
