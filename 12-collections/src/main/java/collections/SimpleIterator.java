package collections;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.Iterator;
import java.util.List;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public class SimpleIterator {
  public static void main(String[] args) {
    List<Pet> pets = Pets.list(12);
    Iterator<Pet> it = pets.iterator();

    while (it.hasNext()) {
      Pet p = it.next();
      System.out.print(p.id() + ":" + p + " ");
    }
    System.out.println();
    for (Pet p : pets) {
      System.out.print(p.id() + ":" + p + " ");
    }
    System.out.println();
    it = pets.iterator();
    for (int i = 0; i < 6; i++) {
      it.next();
      it.remove();
    }
    System.out.println(pets);
  }
}
