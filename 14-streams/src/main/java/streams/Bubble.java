package streams;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class Bubble {
    public final int i;

    public Bubble(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Bubble(" + i + ")";
    }
    private static int count = 0;

    public static Bubble bubbler(){
        return new Bubble(count++);
    }
}
