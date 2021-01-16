package generics;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
interface SelfBoundSetter<T extends SelfBoundSetter<T>>{
    void set(T arg);
}
interface Setter extends SelfBoundSetter<Setter>{

}

public class SelfBoundingAndCovariantArguments {
    void testA(Setter s1,Setter s2 ,SelfBoundSetter sbs){
        s1.set(s2);
        //s1.set(sbs);
    }
}
