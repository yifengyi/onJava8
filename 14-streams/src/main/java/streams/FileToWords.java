package streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class FileToWords {
    public static Stream<String>stream(String filePath)throws Exception{
        return Files.lines(Paths.get(filePath))
                .skip(1) // First (comment) line
                .flatMap(line ->
                        Pattern.compile("\\W+").splitAsStream(line));
    }
}
