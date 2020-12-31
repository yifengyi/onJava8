package collections;

import typeifno.pets.Pet;
import typeifno.pets.Pets;

import java.util.Iterator;

/**
 * 1.0v created by wujf on 2020-12-31
 */
class PetSequence {
  protected Pet[] pets = Pets.array(8);
}

public class NonCollectionSequence extends PetSequence {
  public Iterator<Pet> iterator() {
    return new Iterator<Pet>() {
      private int index = 0;
      @Override
      public boolean hasNext() {
        return index < pets.length;
      }
      @Override
      public Pet next() { return pets[index++]; }
      @Override
      public void remove() { // Not implemented
        throw new UnsupportedOperationException();
      }
    };
  }
  public static void main(String[] args) {
    NonCollectionSequence nc =
            new NonCollectionSequence();
    InterfaceVsIterator.display(nc.iterator());
  }
}
