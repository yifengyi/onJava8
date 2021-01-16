package generics;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
public class SimpleQueue<T> implements Iterable<T> {
    private LinkedList<T> storage = new LinkedList<>();

    public void add(T t){
        storage.offer(t);
    }
    public T get(){
        return storage.poll();
    }

    @Override
    public Iterator<T> iterator() {
        return storage.iterator();
    }
}
