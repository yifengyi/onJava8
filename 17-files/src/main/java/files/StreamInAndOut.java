package files;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * 1.0v created by wujf on 2021-1-7
 */
public class StreamInAndOut {
  public static void main(String[] args) {
    Path p = Paths.get("src", "main", "java", "files", "StreamInAndOut.java");
    Path des = Paths.get("src", "main", "resources", "StreamInAndOut.txt");
    try (
            Stream<String> input = Files.lines(p);
            PrintWriter output =
                    new PrintWriter(des.getFileName().toString())
    ) {
      input.map(String::toUpperCase)
              .forEachOrdered(output::println);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
