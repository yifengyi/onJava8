package streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class FileToWordsRegexp {
    private String all;

    public FileToWordsRegexp(String filePath) throws Exception {
        all = Files.lines(Paths.get(filePath))
                .skip(1)
                .collect(Collectors.joining(" "));
    }

    public Stream<String> stream() {
        return Pattern.compile("[.,?]+").splitAsStream(all);
    }

    public static void main(String[] args) throws Exception {
        String path = System.getProperty("user.dir") + "//14-streams//src//main//java/streams//Cheese.dat";
        FileToWordsRegexp fw = new FileToWordsRegexp(path);
        fw.stream()
                .limit(7)
                .map(w -> w + " ")
                .forEach(System.out::print);
        System.out.println();
        fw.stream()
                .skip(7)
                .limit(2)
                .map(w -> w + " ")
                .forEach(System.out::print);
    }
}
