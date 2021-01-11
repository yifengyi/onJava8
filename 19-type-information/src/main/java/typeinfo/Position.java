package typeinfo;

import java.util.Optional;

/**
 * 1.0v created by wujf on 2021-1-11
 */
class EmptyTitelException extends RuntimeException{}
public class Position {
  private String title;
  private Person person;

  public Position(String title, Person person) {
    setTitle(title);
    setPerson(person);
  }

  public Position(String title) {
    this(title, null);
  }
  public String getTitle(){
    return title;
  }
  public void setTitle(String title){
    this.title = Optional.ofNullable(title)
            .orElseThrow(EmptyTitelException::new);
  }

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = Optional.ofNullable(person)
    .orElse(new Person());
  }

  @Override
  public String toString() {
    return "Position: " + title +
            ", Employee: " + person;
  }

  public static void main(String[] args) {
    System.out.println(new Position("CEO"));
    System.out.println(new Position("Programmer",
            new Person("Arthur", "Fonzarelli")));
    try {
      new Position(null);
    } catch (Exception e) {
      System.out.println("caught " + e);
    }
  }
}
