package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class RandowWords implements Supplier<String> {
    List<String> words = new ArrayList<>();
    Random rand = new Random(47);

    RandowWords(String fname) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(fname));

        for (String line : lines.subList(1, lines.size())) {
            for (String word : line.split("[.?,]+")) {
                words.add(word.toLowerCase());
            }
        }
    }


    @Override
    public String get() {
        return words.get(rand.nextInt(words.size()));
    }

    @Override
    public String toString() {
        return words.stream()
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) throws Exception {

        String path = System.getProperty("user.dir") + "\\14-streams\\src\\main\\java\\streams\\Cheese.dat";
        //System.out.println(path);
        System.out.println(Stream.generate(new RandowWords(path))
                .limit(10)
                .collect(Collectors.joining(" ")));
    }
}
