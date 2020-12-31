package collections;

import typeifno.pets.Pet;
import typeifno.pets.Pets;

import java.util.*;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public class CrossCollectionIteration {
  public static void display(Iterator<Pet> it){
    while (it.hasNext()) {
      Pet p = it.next();
      System.out.print(p.id() + ":" + p + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    List<Pet> pets = Pets.list(8);
    LinkedList<Pet> petsLL = new LinkedList<>(pets);
    HashSet<Pet> petsHS = new HashSet<>(pets);
    TreeSet<Pet> petsTS = new TreeSet<>(pets);
    display(pets.iterator());
    display(petsLL.iterator());
    display(petsHS.iterator());
    display(petsTS.iterator());
  }
}
