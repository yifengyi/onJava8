package streams;

import java.util.Comparator;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class SortedComparator {
    public static void main(String[] args) throws Exception {
        String path = System.getProperty("user.dir")
                + "\\14-streams\\src\\main\\java\\streams\\Cheese.dat";

        FileToWords.stream(path)
                .skip(10)
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .map(w -> w + " ")
                .forEach(System.out::print);
    }
}
