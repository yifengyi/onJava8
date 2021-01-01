package streams;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class FileToWordsTest {
    public static void main(String[] args) throws Exception {
        String path = System.getProperty("user.dir")
                + "\\14-streams\\src\\main\\java\\streams\\Cheese.dat";

        FileToWords.stream(path)
                .limit(7)
                .forEach(s -> System.out.format("%s ", s));
        System.out.println();
        FileToWords.stream(path)
                .skip(7)
                .limit(2)
                .forEach(s -> System.out.format("%s ", s));
    }
}
