package enums;

import java.util.Random;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
public enum Input {
    NICKEL(5),DIME(10),QUARTER(25),DOLLAR(100),
    TOOTHPASTE(200),CHIPS(75),SODA(100),SOAP(50),
    ABORT_TRANSACTION{
        @Override
        int amount() {
            throw new RuntimeException("ABORT.amount()");
        }
    },
    STOP{
        @Override
        int amount() {
            throw new RuntimeException("SHUT_DOWN.amount()");
        }
    }
    ;

    Input(int value) {
        this.value = value;
    }

    Input() {
    }

    int value;
    int amount(){
        return value;
    }

    static Random rand = new Random(47);

    public static Input randomSelection(){
        //// Don't include STOP:
        return values()[rand.nextInt(values().length - 1)];
    }
}
