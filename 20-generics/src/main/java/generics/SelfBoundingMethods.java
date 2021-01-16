package generics;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
public class SelfBoundingMethods {
    static <T extends SelfBounded<T>> T f(T arg){
        return arg.set(arg).get();
    }

    public static void main(String[] args) {
        A a = f(new A());
    }
}
