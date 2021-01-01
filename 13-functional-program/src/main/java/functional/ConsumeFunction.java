package functional;

import java.util.function.Function;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
class One{}
class Two{}
public class ConsumeFunction {
    static Two consume(Function<One,Two> onetwo){
        return onetwo.apply(new One());
    }

    public static void main(String[] args) {
        Two two = consume(one -> new Two());
    }
}
