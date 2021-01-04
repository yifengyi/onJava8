package exceptions;

/**
 * V1.0 created by wujf  on  2021-01-04
 */
class Annoyance extends Exception{}
class Sneeze extends Annoyance{}

public class Human {
    public static void main(String[] args) {
        try {
            throw new Sneeze();
        } catch (Sneeze sneeze) {
            System.out.println("Caught Sneeze");
        }catch (Annoyance a){
            System.out.println("Caught Annoyance");
        }

        try {
            throw new Sneeze();
        } catch (Annoyance a) {
            System.out.println("Caught Annoyance");
        }
    }
}
