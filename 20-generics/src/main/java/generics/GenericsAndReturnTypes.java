package generics;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
interface GenericGetter<T extends GenericGetter<T>>{
    T get();
}
interface Getter extends GenericGetter<Getter>{

}
public class GenericsAndReturnTypes {
    void test(Getter g){
        Getter res = g.get();

        GenericGetter gg = g.get();
    }
}
