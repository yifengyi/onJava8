package typeifno.pets;

import java.util.Objects;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public class Individual implements Comparable<Individual> {
  private static long   counter = 0;
  private final  long   id      = counter++;
  private        String name;

  public Individual(String name) {
    this.name = name;
  }

  public Individual() {
  }

  @Override
  public String toString() {
    return getClass().getSimpleName()
            + (name == null ? "" : " " + name);
  }

  public long id() {
    return id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof Individual
            && Objects.equals(id, (((Individual) obj).id));
  }

  @Override
  public int compareTo(Individual o) {
    String first = getClass().getSimpleName();
    String argFirst = o.getClass().getSimpleName();
    int firstCompare = first.compareTo(argFirst);
    if (firstCompare != 0) {
      return firstCompare;
    }
    if (name != null
            && o.name != null) {
      int secondCompare = name.compareTo(o.name);
      if (secondCompare != 0) {
        return secondCompare;
      }
    }
    //Long.compareTo(o.id,id);
    return (o.id < id ? -1 : (o.id == id ? 0 : 1));
  }
}
