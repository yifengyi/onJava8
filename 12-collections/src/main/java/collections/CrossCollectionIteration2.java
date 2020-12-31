package collections;

import typeifno.pets.Pet;
import typeifno.pets.Pets;

import java.util.*;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public class CrossCollectionIteration2 {
  public static void display(Iterable<Pet> ip){
    Iterator<Pet> it = ip.iterator();
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
    display(pets);
    display(petsLL);
    display(petsHS);
    display(petsTS);
  }
}
