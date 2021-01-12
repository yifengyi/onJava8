package generics;

import java.awt.*;

/**
 * 1.0v created by wujf on 2021-1-12
 */
interface HasColor{
  java.awt.Color getColor();
}
class WithColor<T extends HasColor>{
  T item;

  public WithColor(T item) {
    this.item = item;
  }

  public T getItem() {
    return item;
  }
  java.awt.Color color(){
    return item.getColor();
  }
}
class Coord{
  public int x,y,z;
}
class WithColorCoord<T extends Coord & HasColor>{
  T item;

  public WithColorCoord(T item) {
    this.item = item;
  }

  public T getItem() {
    return item;
  }
  java.awt.Color color(){
    return item.getColor();
  }
  int getX(){
    return item.x;
  }
  int getY() {
    return item.y;
  }

  int getZ() {
    return item.z;
  }
}
interface Weight{
  int weight();
}
class Solid<T extends Coord & HasColor & Weight>{
  T item;

  Solid(T item) {
    this.item = item;
  }

  T getItem() {
    return item;
  }

  java.awt.Color color() {
    return item.getColor();
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

  int weight() {
    return item.weight();
  }
}
class Bounded extends Coord implements HasColor,Weight{
  @Override
  public java.awt.Color getColor() {
    return null;
  }

  @Override
  public int weight() {
    return 0;
  }
}
public class BasicBounds {
  public static void main(String[] args) {
    Solid<Bounded> solid =
            new Solid<>(new Bounded());
    solid.color();
    solid.getY();
    solid.weight();
  }
}