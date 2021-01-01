package functional;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
class Dog{
    String name;
    int age = -1;

    public Dog() {
        name = "stray";
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
interface MakeNoArgs{
    Dog make();
}
interface Make1Arg{
    Dog make(String nm);
}
interface Make2Arg{
    Dog make(String nm, int age);
}
public class CtorReference {
    public static void main(String[] args) {
        MakeNoArgs mna = Dog::new;
        Make1Arg m1a = Dog::new;
        Make2Arg m2a = Dog::new;

        Dog dn = mna.make();
        Dog d1 = m1a.make("Comet");
        Dog d2 = m2a.make("ralph", 4);

    }
}
