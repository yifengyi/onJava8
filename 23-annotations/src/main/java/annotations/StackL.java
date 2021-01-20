package annotations;

import java.util.LinkedList;

/**
 * 1.0v created by wujf on 2021-1-20
 */
public class StackL<T> {
  private LinkedList<T> list = new LinkedList<>();
  public void push(T v){
    list.addFirst(v);
  }
  public T top(){
    return list.getFirst();
  }
  public T pop(){
    return list.removeFirst();
  }
}
