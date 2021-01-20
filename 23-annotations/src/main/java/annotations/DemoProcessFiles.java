package annotations;

import onjava.ProcessFiles;

/**
 * 1.0v created by wujf on 2021-1-20
 */
public class DemoProcessFiles {
  //param src\main\java\annotations
  public static void main(String[] args) {
    new ProcessFiles(file->System.out.println(file),"java").start(args);
  }
}
