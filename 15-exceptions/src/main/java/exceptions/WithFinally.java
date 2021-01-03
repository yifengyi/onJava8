package exceptions;

/**
 * V1.0 created by wujf  on  2021-01-02
 */
public class WithFinally {
    static Switch sw = new Switch();

    public static void main(String[] args) {
        try {
            sw.on();
            OnOffSwitch.f();
        } catch (OnOffException1 exception1) {
            System.out.println("OnOffException1");
        } catch (OnOffException2 onOffException2) {
            System.out.println("OnOffException2");
        }finally {
            sw.off();
        }
    }
}
