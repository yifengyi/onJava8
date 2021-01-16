package generics;

import java.util.List;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
public class UserList<W,T> {
    //泛型擦除，所以重载方法产生了相同的类型签名
    //void f(List<T> v){}

    void f(List<W> v){}

    void f2(List<T> v){}
}
