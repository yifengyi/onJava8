package streams;

/**
 * V1.0 created by wujf  on  2021-01-02
 */
public class Informational {
    public static void main(String[] args) throws Exception {
        String path = System.getProperty("user.dir") + "\\14-streams\\src\\main\\java\\streams\\Cheese.dat";

        System.out.println(FileToWords.stream(path).count());

        System.out.println(FileToWords.stream(path)
                .min(String.CASE_INSENSITIVE_ORDER)
                .orElse("NONE"));

        System.out.println(FileToWords.stream(path)
                .max(String.CASE_INSENSITIVE_ORDER)
                .orElse("NONE"));
    }
}
