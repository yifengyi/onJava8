package streams;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

/**
 * V1.0 created by wujf  on  2021-01-02
 */
public class Signal {
    private final String msg;

    public Signal(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Signal(" + msg + ")";
    }

    static Random ran = new Random(47);

    public static Signal morse() {
        switch (ran.nextInt(4)) {
            case 1:
                return new Signal("dot");
            case 2:
                return new Signal("dash");
            default:
                return null;

        }
    }

    public static Stream<Optional<Signal>> stream(){
        return Stream.generate(Signal::morse)
                .map(signal -> Optional.ofNullable(signal));
    }

}
