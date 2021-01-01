package streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class FileToWordsBuilder {
    Stream.Builder<String> builder = Stream.builder();

    public FileToWordsBuilder(String filePath) throws Exception{
        Files.lines(Paths.get(filePath))
                .skip(1)
                .forEach(line->{
                    for (String w : line.split("[.?,]+")) {
                        builder.add(w);
                    }
                });
    }

    Stream<String> stream(){
        return builder.build();
    }

    public static void main(String[] args) throws Exception {
        String path = System.getProperty("user.dir")+"\\14-streams\\src\\main\\java\\streams\\Cheese.dat";
        new FileToWordsBuilder(path)
        .stream()
        .limit(7)
        .map(w->w+" ")
        .forEach(System.out::print);
    }
}
