package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 1.0v created by wujf on 2021-1-7
 */
public class ListOfLines {
  public static void main(String[] args) throws IOException {
    Files.readAllLines(
            Paths.get("target","classes","Cheese.dat")
    ).stream()
    .filter(line->!line.startsWith("//"))
    .map(line->line.substring(0,line.length()/2))
    .forEach(System.out::println);


  }
}
