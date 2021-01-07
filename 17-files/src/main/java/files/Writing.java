package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

/**
 * 1.0v created by wujf on 2021-1-7
 */
public class Writing {
  static Random rand = new Random(47);
  static final int SIZE = 1000;

  public static void main(String[] args) throws IOException {
    byte[] bytes = new byte[SIZE];
    String[] paths = {};
    rand.nextBytes(bytes);
    Path test = Paths.get("src", "main", "resources","bytes.dat");
    Files.write(test,bytes);
    System.out.println("bytes.dat： " + Files.size(test));

    Path cheeseDat = Paths.get("src", "main", "resources","cheese.dat");
    List<String> lines = Files.readAllLines(cheeseDat);
    Path cheese = Paths.get("src", "main", "resources","Cheese.txt");
    Files.write(cheese, lines);
    System.out.println("Cheese.txt: " + Files.size(cheese));

  }
}
