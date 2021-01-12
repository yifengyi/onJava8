package generics;

import onjava.Tuple4;

import java.util.ArrayList;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class TupleList<A,B,C,D>extends ArrayList<Tuple4<A,B,C,D>> {
  public static void main(String[] args) {
    TupleList<Vehicle,Amphibian,String,Integer> tl =
            new TupleList<>();
    tl.add(TupleTest2.h());
    tl.add(TupleTest2.h());
    tl.forEach(System.out::println);
  }

}
