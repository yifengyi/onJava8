package collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public class UniqueWords {
  public static void main(String[] args) throws IOException {
    String fileName = "aa.txt";
    String path = Objects.requireNonNull(UniqueWords.class.getClassLoader().getResource(fileName)).getPath();

    path = path.substring(1, path.length()).replaceAll("/", "\\\\");


    List<String> lines = Files.readAllLines(
            Paths.get(path)
    );
    Set<String> words = new TreeSet<>();
    for (String line : lines) {
      for (String word : line.split("\\W+")) {
        if (word.trim().length() > 0) {
          words.add(word);
        }
      }
    }
    System.out.println(words);
  }
}
