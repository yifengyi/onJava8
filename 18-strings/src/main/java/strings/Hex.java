package strings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 1.0v created by wujf on 2021-1-8
 */
public class Hex {
  public static String format(byte[] data){
    StringBuilder sb = new StringBuilder();
    int n = 0;
    for (byte b : data) {
      if (n%16==0) {
        sb.append(String.format("%05x: ", n));
      }
      sb.append(String.format("%02x ", b));
      n++;
      if (n%16==0) {
        sb.append("\n");
      }
    }
    sb.append("\n");
    return sb.toString();
  }

  public static void main(String[] args) throws IOException {
    if (args.length==0) {
      Path p = Paths.get("target","classes","strings","Hex.class");

      System.out.println(format(Files.readAllBytes(p)));
    }else{
      Path p = Paths.get(args[0]);
      System.out.println(format(Files.readAllBytes(p)));
    }
  }
}
