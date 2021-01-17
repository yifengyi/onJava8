package arrays;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
public class ArrayOfGenericType<T> {
    T[] array;

    @SuppressWarnings("unchecked")
    public ArrayOfGenericType(int size){
        //array = new T[size];

        array = (T[]) new Object[size];
    }
}
