package reuse;

/**
 * 1.0v created by wujf on 2020-12-28
 */
class Villain{
  private String name;
  protected  void set(String nm){
    name = nm;
  }
  Villain(String name){
    this.name = name;
  }
  @Override
  public String toString(){
    return "I'm a reuse.Villain and my name is " + name;
  }
}
public class Orc extends Villain{
  private int orcNumber;

  public Orc(String name,int orcNumber){
    super(name);
    this.orcNumber = orcNumber;
  }
  public void change(String name,int orcNumber){
    set(name);
    this.orcNumber = orcNumber;
  }
  @Override
  public String toString(){
    return "reuse.Orc " + orcNumber + ": " + super.toString();
  }

  public static void main(String[] args) {
    Orc orc = new Orc("Limburger", 12);
    System.out.println(orc);
    orc.change("Bob", 19);
    System.out.println(orc);
  }
}
