package annotations;

import onjava.atunit.*;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * 1.0v created by wujf on 2021-1-20
 */
public class AtUnitExample5 {
  private String text;
  public AtUnitExample5(String text) {
    this.text = text;
  }
  @Override
  public String toString() { return text; }
  @TestProperty
  static PrintWriter output;
  @TestProperty
  static int counter;
  @TestObjectCreate
  static AtUnitExample5 create() {
    String id = Integer.toString(counter++);
    try {
      output = new PrintWriter("Test" + id + ".txt");
    } catch(IOException e) {
      throw new RuntimeException(e);
    }
    return new AtUnitExample5(id);
  }
  @TestObjectCleanup
  static void cleanup(AtUnitExample5 tobj) {
    System.out.println("Running cleanup");
    output.close();
  }
  @Test
  boolean test1() {
    output.print("test1");
    return true;
  }
  @Test
  boolean test2() {
    output.print("test2");
    return true;
  }
  @Test
  boolean test3() {
    output.print("test3");
    return true;
  }

  //param target\classes\annotations\AtUnitExample1
  public static void main(String[] args) {
    AtUnit.main(args);
  }
}
