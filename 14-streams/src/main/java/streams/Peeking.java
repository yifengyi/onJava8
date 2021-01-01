package streams;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class Peeking {
    public static void main(String[] args) throws Exception {
        String path = System.getProperty("user.dir")
                + "\\14-streams\\src\\main\\java\\streams\\Cheese.dat";
        FileToWords.stream(path)
                .skip(21)
                .limit(4)
                .map(w -> w + " ")
                .peek(System.out::print)
                .map(String::toUpperCase)
                .peek(System.out::print)
                .map(String::toLowerCase)
                .forEach(System.out::print);
    }
}
