package generics;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
class Base{}
class Derived extends Base{}
interface OrdinaryGetter{
    Base get();
}
interface DerivedGetter extends OrdinaryGetter{
    @Override
    Derived get();
}
public class CovariantReturnTypes {
    void test(DerivedGetter d){
        Derived d2 = d.get();
    }
}
