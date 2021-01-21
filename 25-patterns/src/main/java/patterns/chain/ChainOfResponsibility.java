package patterns.chain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 * 1.0v created by wujf on 2021-1-21
 */
class Result{
  boolean success;
  List<Double> line;
  Result(List<Double> data){
    success = true;
    line = data;
  }
  Result(){
    success = false;
    line = Collections.<Double>emptyList();
  }
}
class Fail extends Result{

}
interface Algorithm{
  Result algorithm(List<Double> line);
}
class FindMinima{
  public static Result leastSquares(List<Double> line){
    System.out.println("LeastSquares.algorithm");
    boolean weSucceed = false;
    if (weSucceed) {
      return new Result(Arrays.asList(1.1, 2.2));
    }else{
      return new Fail();
    }
  }
  public static Result perturbation(List<Double> line){
    System.out.println("Perturbation.algorithm");
    boolean weSucceed = false;
    if (weSucceed) {
      return new Result(Arrays.asList(3.3, 4.4));
    }else{
      return new Fail();
    }
  }
  public static Result bisection(List<Double> line){
    System.out.println("Bisection.algorithm");
    boolean weSucceed = true;
    if (weSucceed) {
      return new Result(Arrays.asList(5.5, 6.6));
    }else{
      return new Fail();
    }
  }

  static List<Function<List<Double>, Result>> algorithms =
          Arrays.asList(
                  FindMinima::leastSquares,
                  FindMinima::perturbation,
                  FindMinima::bisection
          );

  public static Result minima(List<Double> line){
    for (Function<List<Double>, Result> alg : algorithms) {
      Result result = alg.apply(line);
      if (result.success) {
        return result;
      }
    }
    return new Fail();
  }
}
public class ChainOfResponsibility {
  public static void main(String[] args) {
    // FindMinima solver = new FindMinima();
    List<Double> line = Arrays.asList(1.0, 2.0, 1.0, 2.0, -1.0,
            3.0, 4.0, 5.0, 4.0);
    Result result = FindMinima.minima(line);
    if (result.success) {
      System.out.println(result.line);
    }else{
      System.out.println("No algorithm found");
    }
  }
}
