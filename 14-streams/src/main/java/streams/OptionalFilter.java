package streams;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class OptionalFilter {
    static String[] elements = {
            "Foo", "", "Bar", "Baz", "Bingo"
    };

    static Stream<String> testStream() {
        return Arrays.stream(elements);
    }

    static void test(String desc, Predicate<String> pred) {
        System.out.println("---( " + desc + " )---");
        for (int i = 0; i < elements.length; i++) {
            System.out.println(testStream().skip(i)
                    .findFirst()
                    .filter(pred));
        }
    }

    public static void main(String[] args) {
        test("true", str -> true);
        test("false", str -> false);
        test("str != \"\"", str -> str != "");
        test("startsWith(\"B\")", str -> str.startsWith("B"));
    }
}
