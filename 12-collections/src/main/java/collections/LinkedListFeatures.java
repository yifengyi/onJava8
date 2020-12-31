package collections;

import typeifno.pets.Hamster;
import typeifno.pets.Pet;
import typeifno.pets.Pets;
import typeifno.pets.Rat;

import java.util.LinkedList;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public class LinkedListFeatures {
  public static void main(String[] args) {
    LinkedList<Pet> pets =
            new LinkedList<>(Pets.list(5));
    System.out.println(pets);
    System.out.println("typeifno.pets.getFirst(): " + pets.getFirst());
    System.out.println("typeifno.pets.element(): " + pets.element());
    System.out.println("typeifno.pets.peek(): " + pets.peek());
    System.out.println("typeifno.pets.remove(): " + pets.remove());
    System.out.println("typeifno.pets.removeFirst(): " + pets.removeFirst());
    System.out.println("typeifno.pets.poll(): " + pets.poll());
    System.out.println(pets);
    pets.addFirst(new Rat());
    System.out.println("After addFirst(): " + pets);
    pets.offer(Pets.get());
    System.out.println("After offer(): " + pets);
    pets.add(Pets.get());
    System.out.println("After add(): " + pets);
    pets.addLast(new Hamster());
    System.out.println("After addLast(): " + pets);
    System.out.println("typeifno.pets.removeLast(): " + pets.removeLast());
  }
}
