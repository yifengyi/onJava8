package housekeeping; /**
 * 1.0v created by wujf on 2020-12-28
 */
public class Leaf {
  int i = 0;
  Leaf increment(){
    i++;
    return this;
  }
  void print(){
    System.out.println("i = " + i);
  }

  public static void main(String[] args) {
    Leaf x = new Leaf();
    x.increment().increment().increment().print();
  }
}
