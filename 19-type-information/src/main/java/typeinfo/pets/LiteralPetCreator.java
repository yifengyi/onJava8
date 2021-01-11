package typeinfo.pets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public class LiteralPetCreator extends PetCreator {

  @SuppressWarnings("unchecked")
  public static final List<Class<? extends Pet>> ALL_TYPES =
          Collections.unmodifiableList(Arrays.asList(
                  Pet.class, Dog.class, Cat.class, Rodent.class,
                  Mutt.class, Pug.class, EgyptianMau.class,
                  Manx.class, Cymric.class, Rat.class,
                  Mouse.class, Hamster.class));
  private static final List<Class<? extends Pet>> TYPES     =
          ALL_TYPES.subList(ALL_TYPES.indexOf(Mutt.class), ALL_TYPES.size());


  @Override
  public List<Class<? extends Pet>> types() {
    return TYPES;
  }

  public static void main(String[] args) {
    System.out.println(TYPES);
  }
}
