package operators;

/**
 * V1.0 created by wujf  on  2020-12-27
 */
public class TestIfElse {
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }

    static int standardIfEles(int i){
        if(i<10)
            return i*100;
        else
            return i*10;
    }

    public static void main(String[] args) {
        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(standardIfEles(9));
        System.out.println(standardIfEles(10));
    }
}
