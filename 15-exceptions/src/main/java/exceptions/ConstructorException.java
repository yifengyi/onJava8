package exceptions;

/**
 * V1.0 created by wujf  on  2021-01-04
 */
class CE extends Exception{}
class SecondExcept extends Reporter{
    SecondExcept() throws CE{
        super();
        throw new CE();
    }
}
public class ConstructorException {
    public static void main(String[] args) {
        try (
                First f = new First();
                SecondExcept s = new SecondExcept();
                Second s2 = new Second()
        ) {
            System.out.println("In body");
        } catch (CE ce) {
            System.out.println("Caught: " + ce);
        }

    }
}
