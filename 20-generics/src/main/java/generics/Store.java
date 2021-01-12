package generics;

import onjava.Suppliers;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

/**
 * 1.0v created by wujf on 2021-1-12
 */
class Product{
  private final int id;
  private String description;
  private double price;

  public Product(int id, String description, double price) {
    this.id = id;
    this.description = description;
    this.price = price;
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return id+": "+description+
            ", price: $"+price;
  }
  public void priceChange(double change){
    price+=change;
  }

  public static Supplier<Product> generator =
    new Supplier<Product>() {
      private Random rand = new Random(47);

      @Override
      public Product get() {
        return new Product(rand.nextInt(1000),
                "Test",
                Math.round(rand.nextDouble()*1000.0)+0.99);
      }
    };
}
class Shelf extends ArrayList<Product>{
  Shelf(int nProducts){
    Suppliers.fill(this, Product.generator, nProducts);
  }
}
class Aisle extends ArrayList<Shelf>{
  Aisle(int nShelves,int nProducts){
    for (int i = 0; i < nShelves; i++) {
      add(new Shelf(nProducts));
    }
  }
}
class CheckoutStand{}
class Office{}
public class Store extends ArrayList<Aisle>{
  private ArrayList<CheckoutStand> checkouts =
          new ArrayList<>();
  private Office office = new Office();
  public Store(int nAisles,int nShelves,int nProducts){
    for (int i = 0; i < nAisles; i++) {
      add(new Aisle(nShelves,nProducts));
    }
  }

  @Override
  public String toString() {
    StringBuffer result = new StringBuffer();
    for (Aisle aisle : this) {
      for (Shelf shelf : aisle) {
        for (Product p : shelf) {
          result.append(p);
          result.append("\n");
        }
      }
    }
    return result.toString();
  }

  public static void main(String[] args) {
    System.out.println(new Store(5, 4, 3));
  }
}
