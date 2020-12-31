package interfaces.interfaceprocessor;

/**
 * 1.0v created by wujf on 2020-12-29
 */
public class Applicator {
  public static void apply(Processor p,Object s){
    System.out.println("Using Processor " + p.name());
    System.out.println(p.process(s));
  }
}
