package typeifno.pets;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public abstract class PetCreator implements Supplier<Pet> {
  private Random rand = new Random(47);

  public abstract List<Class<? extends Pet>> types();

  @Override
  public Pet get() {
    int n = rand.nextInt(types().size());
    try {
      return types().get(n).getConstructor().newInstance();
    } catch (InstantiationException
            | IllegalAccessException
            | InvocationTargetException
            | NoSuchMethodException e) {
      throw new RuntimeException(e);
    }
  }
}
