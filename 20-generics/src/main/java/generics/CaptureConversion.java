package generics;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
public class CaptureConversion {
    static <T> void f1(Holder<T> holder){
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Holder<?> holder){
        f1(holder);
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Holder raw = new Holder<>(1);

        f1(raw);

        f2(raw);

        Holder rawBasic = new Holder();
        rawBasic.set(new Object());
        f2(rawBasic);

        Holder<?> wildcarded = new Holder<>(1.0);
        f2(wildcarded);
    }
}
