package files;

import onjava.RmDir;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 1.0v created by wujf on 2021-1-7
 */
public class Directories {
  static Path test = Paths.get("src","test");
  static String sep = FileSystems.getDefault().getSeparator();
  static List<String> parts = Arrays.asList("foo","bar","baz","bag");

  static Path makeVariant(){
    Collections.rotate(parts,1);
    return Paths.get("src","test", String.join(sep, parts));
  }
  static void refreshTestDir()throws Exception{
    if (Files.exists(test)) {
      RmDir.rmDir(test);
    }
    if (!Files.exists(test)) {
      Files.createDirectories(test);
    }
  }
  static void populateTestDir()throws Exception{
    for (int i = 0; i < parts.size(); i++) {
      Path variant =makeVariant();
      if (!Files.exists(variant)) {
        Files.createDirectories(variant);
        Files.copy(Paths.get("src","main","java","files","Directories.java"),
                variant.resolve("File.txt"));
        Files.createTempFile(variant, null, null);
      }
    }
  }

  public static void main(String[] args) throws Exception {
    refreshTestDir();
    Files.createFile(test.resolve("Hello.txt"));
    Path variant =makeVariant();

    try {
      Files.createDirectory(variant);
    } catch (IOException e) {
      System.out.println("Nope ,that doesn't work.");
    }
    populateTestDir();
    Path tempdir = Files.createTempDirectory(test,"DIR_");
    Files.createTempFile(tempdir, "pre", ".non");
    Files.newDirectoryStream(test).forEach(System.out::println);
    System.out.println("*********");
    Files.walk(test).forEach(System.out::println);
  }
}
