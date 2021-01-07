package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 1.0v created by wujf on 2021-1-7
 */
public class ReadLineStream {
  public static void main(String[] args) throws IOException {
    Path p = Paths.get("src","main","java","files","PathInfo.java");

    Files.lines(p)
            .skip(13)
            .findFirst()
            .ifPresent(System.out::println);
  }
}
