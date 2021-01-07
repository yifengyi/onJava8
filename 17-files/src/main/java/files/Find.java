package files;

import java.nio.file.*;

/**
 * 1.0v created by wujf on 2021-1-7
 */
public class Find {
  public static void main(String[] args) throws Exception {
   Path test = Paths.get("src", "test");
   Directories.refreshTestDir();
   Directories.populateTestDir();

    Files.createDirectory(test.resolve("dir.tmp"));

    PathMatcher matcher = FileSystems.getDefault()
            .getPathMatcher("glob:**/*.{tmp,txt}");
    Files.walk(test)
            .filter(matcher::matches)
            .forEach(System.out::println);

    System.out.println("*****************");
    PathMatcher matcher2 = FileSystems.getDefault()
            .getPathMatcher("glob:*.tmp");
    Files.walk(test)
            .map(Path::getFileName)
            .filter(matcher2::matches)
            .forEach(System.out::println);
    System.out.println("*****************");

    Files.walk(test)
            .filter(Files::isRegularFile)
            .map(Path::getFileName)
            .filter(matcher2::matches)
            .forEach(System.out::println);
  }
}
