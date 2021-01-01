package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * V1.0 created by wujf  on  2021-01-02
 */
public class TreeSetOfWords {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + "\\14-streams\\src\\main\\java\\streams\\Cheese.dat";
        Set<String> words2 = Files.lines(Paths.get(path))
                .flatMap(s-> Arrays.stream(s.split("\\W+")))
                .filter(s->!s.matches("\\d+"))
                .map(String::trim)
                .filter(s->s.length()>2)
                .limit(100)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(words2);


    }
}
