package streams;

import java.util.ArrayList;

/**
 * V1.0 created by wujf  on  2021-01-02
 */
public class SpecialCollector {
    public static void main(String[] args) throws Exception {
        String path = System.getProperty("user.dir") + "\\14-streams\\src\\main\\java\\streams\\Cheese.dat";

        ArrayList<String> words =
                FileToWords.stream(path)
                        .collect(ArrayList::new,
                                ArrayList::add,
                                ArrayList::addAll);
        words.stream()
                .filter(s -> s.equals("cheese"))
                .forEach(System.out::println);

    }
}
