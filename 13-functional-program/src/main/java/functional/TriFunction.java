package functional;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public interface TriFunction<T,U,V,R> {
    R apply(T t, U u, V v);
}
