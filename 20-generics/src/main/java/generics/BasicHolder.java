package generics;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
public class BasicHolder<T> {
    T element;
    void set(T arg){
        element = arg;
    }

    T get(){
        return element;
    }
    void f(){
        System.out.println(element.getClass().getSimpleName());
    }
}
