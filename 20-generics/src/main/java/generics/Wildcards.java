package generics;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
public class Wildcards {
    static void rawArgs(Holder holder,Object arg){
        //holder.set(arg);

        Object obj =holder.get();
    }

    static void unboundedArg(Holder<?> holder ,Object arg){
        //holder.set(arg);
        Object obj =holder.get();

    }

    static <T> T exact1(Holder<T> holder){
        return holder.get();
    }

    static <T> T exact2 (Holder<T> holder,T arg){
        holder.set(arg);

        return holder.get();
    }

    static <T> T wildSubtype(Holder<? extends  T> holder,T arg){
        //holder.set(arg);
        return holder.get();
    }

    static <T> void wildSupertype (Holder<? super T> holder,T arg){
        holder.set(arg);

        Object obj = holder.get();
    }

    public static void main(String[] args) {
        Holder raw =new Holder<>();
        raw = new Holder();
        Holder<Long> qulified = new Holder<>();
        Holder<?> unbounded = new Holder<>();
        Holder<? extends Long> bounded = new Holder<>();
        Long lng =1L;

        rawArgs(raw,lng);
        rawArgs(qulified,lng);
        rawArgs(unbounded,lng);
        rawArgs(bounded,args);

        unboundedArg(raw,lng);
        unboundedArg(qulified,lng);
        unboundedArg(unbounded,lng);
        unboundedArg(bounded,lng);


        Long r2 = exact1(qulified);
        Object r3 = exact1(unbounded);
        Long r4 = exact1(bounded);

        Long r6 = exact2(qulified, lng);

        Long r10 = wildSubtype(qulified,lng);
        Object r11 = wildSubtype(unbounded, lng);
        Long r12 = wildSubtype(bounded, lng);

        wildSupertype(qulified,lng);


    }
}
