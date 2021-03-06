package generics;

import onjava.Tuple2;
import onjava.Tuple3;
import onjava.Tuple4;
import onjava.Tuple5;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class TupleTest {
  static Tuple2<String,Integer> f(){
    return new Tuple2<>("hi", 47);
  }

  static Tuple3<Amphibian,String,Integer> g(){
    return new Tuple3<>(new Amphibian(), "hi", 47);
  }
  static Tuple4<Vehicle,Amphibian,String ,Integer> h(){
    return new Tuple4<>(new Vehicle(), new Amphibian(), "hi", 47);
  }
  static Tuple5<Vehicle,Amphibian,String,Integer,Double>k(){
    return new Tuple5<>(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
  }

  public static void main(String[] args) {
    Tuple2<String,Integer> ttsi = f();
    System.out.println(ttsi);
    System.out.println(g());
    System.out.println(h());
    System.out.println(k());
  }
}
