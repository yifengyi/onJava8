package exceptions;

/**
 * V1.0 created by wujf  on  2021-01-02
 */
class EBase1 extends Exception{}
class Except1 extends EBase1{}
class EBase2 extends Exception{}
class Except2 extends EBase2{}
class EBas3 extends Exception{}
class Except3 extends EBas3{}
class EBase4 extends Exception{}
class Except4 extends EBase4{}

public class SameHadler {
    void x()throws Except1,Except2,Except3,Except4{}

    void process(){}
    void f(){
        try {
            x();
        } catch (Except1 e) {
            process();
        } catch (Except2 e) {
            process();
        } catch (Except3 e) {
            process();
        } catch (Except4 e) {
            process();
        }
    }
}
