package generics;

/**
 * 1.0v created by wujf on 2021-1-12
 */
class HoldItem<T>{
  T item;

  public HoldItem(T item) {
    this.item = item;
  }
  T getItem(){
    return item;
  }
}
class WithColor2<T extends HasColor>
        extends HoldItem<T> {
  WithColor2(T item) {
    super(item);
  }

  java.awt.Color color() {
    return item.getColor();
  }
}

class WithColorCoord2<T extends Coord & HasColor>
        extends WithColor2<T> {
  WithColorCoord2(T item) {
    super(item);
  }

  int getX() {
    return item.x;
  }

  int getY() {
    return item.y;
  }

  int getZ() {
    return item.z;
  }
}

class Solid2<T extends Coord & HasColor & Weight>
        extends WithColorCoord2<T> {
  Solid2(T item) {
    super(item);
  }

  int weight() {
    return item.weight();
  }
}
public class InheritBounds {
  public static void main(String[] args) {
    Solid2<Bounded> solid2 =
            new Solid2<>(new Bounded());
    solid2.color();
    solid2.getY();
    solid2.weight();
  }
}
