package typeinfo;

import java.util.Optional;

/**
 * 1.0v created by wujf on 2021-1-11
 */
public class Person {
  public final Optional<String> first;
  public final Optional<String> last;
  private final Optional<String> address;

  public final Boolean empty;

  Person(String first, String last, String address) {
    this.first = Optional.ofNullable(first);
    this.last = Optional.ofNullable(last);
    this.address = Optional.ofNullable(address);
    empty = !this.first.isPresent()
            && !this.last.isPresent()
            && !this.address.isPresent();
  }
  Person(String first, String last) {
    this(first, last, null);
  }

  Person(String last) {
    this(null, last, null);
  }

  Person() {
    this(null, null, null);
  }

  @Override
  public String toString() {
    if (empty) {
      return "<Empty>";
    }
    return (first.orElse("")+
            " "+last.orElse("")+
            " "+address.orElse("")).trim();
  }

  public static void main(String[] args) {
    System.out.println(new Person());
    System.out.println(new Person("Smith"));
    System.out.println(new Person("Bob", "Smith"));
    System.out.println(new Person("Bob", "Smith",
            "11 Degree Lane, Frostbite Falls, MN"));
  }
}
