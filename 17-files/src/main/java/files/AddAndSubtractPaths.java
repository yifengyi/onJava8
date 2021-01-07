package files;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 1.0v created by wujf on 2021-1-7
 */
public class AddAndSubtractPaths {
  static Path base = Paths.get("..","..","..").toAbsolutePath();

  static void show(int id,Path res){
    if (res.isAbsolute()) {
      System.out.println("(" + id + ")r " + base.relativize(res));
    }else{
      System.out.println("(" + id + ") " + res);
    }

    try {
      System.out.println("RealPath: " + res.toRealPath());
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  public static void main(String[] args) {
    System.out.println(System.getProperty("os.name"));
    System.out.println(base);
    Path p = Paths.get("src","main","java","files","AddAndSubtractPaths.java").toAbsolutePath();
    show(1,p);
    Path convoluted = p.getParent()
            .getParent()
            .resolve("strings")
            .resolve("..")
            .resolve(p.getParent().getFileName());
    show(2,convoluted);
    show(3,convoluted.normalize());
    Path p2 = Paths.get("..", "..");
    show(4,p2);
    show(5,p2.normalize());
    show(6,p2.toAbsolutePath().normalize());
    Path p3 = Paths.get(".").toAbsolutePath();
    Path p4 = p3.resolve(p2);
    show(7,p4);
    show(8,p4.normalize());
    Path p5 = Paths.get("").toAbsolutePath();
    show(9,p5);
    show(10,p5.resolveSibling("strings"));
    show(11,Paths.get("nonexistent"));



  }
}
