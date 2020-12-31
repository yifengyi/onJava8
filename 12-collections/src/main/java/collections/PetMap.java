package collections;

import typeifno.pets.Cat;
import typeifno.pets.Dog;
import typeifno.pets.Hamster;
import typeifno.pets.Pet;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public class PetMap {
  public static void main(String[] args) {
    Map<String, Pet> petMap = new HashMap<>();
    petMap.put("My Cat", new Cat("Molly"));
    petMap.put("My Dog", new Dog("Ginger"));
    petMap.put("My Hamster", new Hamster("Bosco"));
    System.out.println(petMap);
    Pet dog = petMap.get("My Dog");
    System.out.println(dog);
    System.out.println(petMap.containsKey("My Dog"));
    System.out.println(petMap.containsValue(dog));
  }
}
