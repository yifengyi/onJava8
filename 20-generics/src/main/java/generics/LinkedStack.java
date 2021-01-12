package generics;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class LinkedStack<T> {
  private static class Node<U>{
    U item ;
    Node<U> next;
    Node(){
      item = null;
      next = null;
    }
    Node(U item,Node<U> next){
      this.item = item;
      this.next = next;
    }
    boolean end(){
      return item ==null && next == null;
    }
  }

  private Node<T> top = new Node<>();

  public void push(T item){
    top = new Node<>(item,top);
  }
  public T pop(){
    T res = top.item;
    if (!top.end()) {
      top = top.next;
    }
    return res;
  }

  public static void main(String[] args) {
    LinkedStack<String> lss = new LinkedStack<>();
    for (String s : "Phasers on stun!".split(" ")) {
      lss.push(s);
    }
    String s ;
    while ((s = lss.pop()) != null) {
      System.out.println(s);
    }
  }
}
