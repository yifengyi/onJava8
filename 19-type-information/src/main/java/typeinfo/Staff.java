package typeinfo;

import java.util.ArrayList;

/**
 * 1.0v created by wujf on 2021-1-11
 */
public class Staff extends ArrayList<Position> {
  public void add(String title,Person person){
    add(new Position(title, person));
  }

  public void add(String ...titles){
    for (String title : titles) {
      add(new Position(title));
    }
  }
  public Staff(String ...titles){
    add(titles);
  }
  public Boolean positionAvailable(String title){
    for (Position position : this) {
      if (position.getTitle().equals(title)
              && position.getPerson().empty) {
        return true;
      }
    }
    return false;
  }
  public void fillPosition(String title,Person hire){
    for (Position position : this) {
      if (position.getTitle().equals(title)
              && position.getPerson().empty) {
        position.setPerson(hire);
        return;
      }
    }
    throw new RuntimeException("Position " + title + " not available");
  }

  public static void main(String[] args) {
    Staff staff = new Staff("President", "CTO",
            "Marketing Manager", "Product Manager",
            "Project Lead", "Software Engineer",
            "Software Engineer", "Software Engineer",
            "Software Engineer", "Test Engineer",
            "Technical Writer");
    staff.fillPosition("President",
            new Person("Me", "Last", "The Top, Lonely At"));
    staff.fillPosition("Project Lead",
            new Person("Janet", "Planner", "The Burbs"));
    if (staff.positionAvailable("Software Engineer"))
      staff.fillPosition("Software Engineer",
              new Person(
                      "Bob", "Coder", "Bright Light City"));
    System.out.println(staff);
  }
}
