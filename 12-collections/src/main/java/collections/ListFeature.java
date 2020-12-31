package collections;

import typeifno.pets.*;

import java.util.*;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public class ListFeature {
  public static void main(String[] args) {
    Random rand = new Random(47);
    List<Pet> pets = Pets.list(7);
    System.out.println("1: " + pets);
    Hamster h = new Hamster();
    pets.add(h);
    System.out.println("2: " + pets);
    System.out.println("3: " + pets.contains(h));
    pets.remove(h);
    Pet p = pets.get(2);
    System.out.println("4: " + p + " " + pets.indexOf(p));

    Pet cymric = new Cymric();
    System.out.println("5: " + pets.indexOf(cymric));
    System.out.println("6: " + pets.remove(cymric));
    System.out.println("7: " + pets.remove(p));
    System.out.println("8: " + pets);

    pets.add(3, new Mouse());
    System.out.println("9: " + pets);
    List<Pet> sub = pets.subList(1,4);
    System.out.println("subList: " + sub);
    System.out.println("10: " + pets.containsAll(sub));

    Collections.sort(sub);
    System.out.println("sorted subList: " + sub);
    System.out.println("11: " + pets.containsAll(sub));
    Collections.shuffle(sub,rand);
    System.out.println("shuffled subList: " + sub);
    System.out.println("12: " + pets.containsAll(sub));

    List<Pet> copy = new ArrayList<>(pets);
    sub = Arrays.asList(pets.get(1), pets.get(4));
    System.out.println("sub: " + sub);
    copy.retainAll(sub);
    System.out.println("13: " + copy);
    copy = new ArrayList<>(pets);
    copy.remove(2);
    System.out.println("14: " + copy);
    copy.removeAll(sub);
    System.out.println("15: " + copy);
    copy.set(1, new Mouse());
    System.out.println("16: " + copy);
    copy.addAll(2, sub);
    System.out.println("17: " + copy);
    System.out.println("18: " + pets.isEmpty());

    copy.clear();
    System.out.println("19: " + pets);
    System.out.println("20: " + pets.isEmpty());
    pets.addAll(Pets.list(4));
    System.out.println("21: " + pets);
    Object[] o = pets.toArray();
    System.out.println("22: " + o[3]);
    Pet[] pa = pets.toArray(new Pet[0]);
    System.out.println("23: " + pa[3].id());

  }
}
