package polymorphism;

/**
 * 1.0v created by wujf on 2020-12-29
 */
class Characteristic{
  private String s;
  Characteristic(String s){
    this.s = s;
    System.out.println("Creating polymorphism.Characteristic "+s);
  }
  protected void dispose(){
    System.out.println("disposing polymorphism.Characteristic "+ s);
  }
}
class Description{
  private String s;
  Description(String s ){
    this.s = s;
    System.out.println("Creating polymorphism.Description "+s);
  }
  protected void dispose(){
    System.out.println("disposing polymorphism.Description " + s);
  }
}
class LivingCreature{
  private Characteristic p = new Characteristic("is live");
  private Description t = new Description("Basic Living Creature");
  LivingCreature(){
    System.out.println("polymorphism.LivingCreature()");
  }
  protected  void dispose(){
    System.out.println("polymorphism.LivingCreature dispose");
    t.dispose();
    p.dispose();
  }
}
class Animal extends  LivingCreature{
  private Characteristic p = new Characteristic("has heart");
  private Description t = new Description("polymorphism.Animal  not vegetable");
  Animal(){
    System.out.println("polymorphism.Animal()");
  }

  @Override
  protected void dispose() {
    System.out.println("polymorphism.Animal dispose");
    t.dispose();
    p.dispose();
    super.dispose();

  }
}
class Amphibian extends  Animal{
  private Characteristic p = new Characteristic("can live in water");
  private Description t = new Description("Both water and land");
  Amphibian(){
    System.out.println("polymorphism.Amphibian()");
  }

  @Override
  protected void dispose() {
    System.out.println("polymorphism.Amphibian dispose");
    t.dispose();
    p.dispose();
    super.dispose();
  }
}
public class Frog extends Amphibian{
  private Characteristic p = new Characteristic("Croaks");
  private Description t = new Description("Eats Bugs");
  public Frog(){
    System.out.println("polymorphism.Frog()");
  }

  @Override
  protected void dispose() {
    System.out.println("polymorphism.Frog dispose");
    t.dispose();
    p.dispose();
    super.dispose();
  }

  public static void main(String[] args) {
    Frog frog = new Frog();
    System.out.println("Bye!");
    frog.dispose();
  }
}
