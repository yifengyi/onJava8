package typeinfo;

import onjava.TypeCounter;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

/**
 * 1.0v created by wujf on 2021-1-11
 */
public class PetCount4 {
  public static void main(String[] args) {
    TypeCounter counter = new TypeCounter(Pet.class);
    Pets.stream()
            .limit(20)
            .peek(counter::count)
            .forEach(p->System.out.print(
                    p.getClass().getSimpleName()+" "
            ));
    System.out.println();
    System.out.println("n " + counter);
  }
}
