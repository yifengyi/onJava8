package generics;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
class SelfBounded<T extends SelfBounded<T>>{
    T element;
    SelfBounded<T> set(T arg){
        element = arg;
        return this;
    }
    T get(){
        return element;
    }
}
class A extends SelfBounded<A>{}
class B extends SelfBounded<A>{}
class C extends SelfBounded<C>{
    C setAndGet(C arg){
        set(arg);
        return get();
    }
}
class D{}
//class E extends SelfBounded<D> {}
class F extends SelfBounded{}
public class SelfBounding {
    //自限定的参数有何意义呢？它可以保证类型参数必须与正在被定义的类相同
    public static void main(String[] args) {
        A a = new A();
        a.set(new A());
        a = a.set(new A()).get();
        a = a.get();
        C c = new C();
        c = c.setAndGet(new C());
    }
}
