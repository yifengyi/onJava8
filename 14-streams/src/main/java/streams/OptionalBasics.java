package streams;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class OptionalBasics {
    static void test(Optional<String> optString){
        if (optString.isPresent()) {
            System.out.println(optString.get());
        }else{
            System.out.println("Nothing inside!");
        }
    }
    public static void main(String[] args) {
        test(Stream.of("Epithets").findFirst());
        test(Stream.<String>empty().findFirst());
    }
}
