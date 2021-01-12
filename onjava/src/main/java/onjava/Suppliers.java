package onjava;

import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 1.0v created by wujf on 2021-1-12
 */
public class Suppliers {
  public static <T,C extends Collection<T>> C
  create(Supplier<C> factory,Supplier<T> gen ,int size){
    return Stream.generate(gen)
            .limit(size)
            .collect(factory, C::add, C::addAll);
  }


  public static <T,C extends Collection<T>>
  C fill(C coll,Supplier<T> gen ,int size){
    Stream.generate(gen)
            .limit(size)
            .forEach(coll::add);
    return coll;
  }
  public static <H,A> H fill(H holder,
                             BiConsumer<H,A> adder,
                             Supplier<A> gen,
                             int size){

    Stream.generate(gen)
            .limit(size)
            .forEach(a->adder.accept(holder,a));
    return holder;
  }
}
