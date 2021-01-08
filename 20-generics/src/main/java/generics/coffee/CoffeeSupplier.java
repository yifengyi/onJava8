package generics.coffee;

import java.util.Iterator;
import java.util.Random;
import java.util.function.Supplier;

/**
 * 1.0v created by wujf on 2021-1-8
 */
public class CoffeeSupplier
        implements Supplier<Coffee>, Iterable<Coffee> {

  private Class<?>[] types = {Latte.class, Mocha.class,
          Cappuccino.class, Americano.class, Breve.class};

  private static Random rand = new Random(47);

  public CoffeeSupplier() {
  }

  private int size = 0;

  public CoffeeSupplier(int size) {
    this.size = size;
  }

  @Override
  public Iterator<Coffee> iterator() {
    return new CoffeeIterator();
  }

  @Override
  public Coffee get() {
    try {
      return (Coffee)
              types[rand.nextInt(types.length)].newInstance();
    } catch (InstantiationException | IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }
  class CoffeeIterator implements Iterator<Coffee>{
    int count = size;

    @Override
    public boolean hasNext() {
      return count>0;
    }

    @Override
    public Coffee next() {
      count--;
      return CoffeeSupplier.this.get();
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }
  }

}
