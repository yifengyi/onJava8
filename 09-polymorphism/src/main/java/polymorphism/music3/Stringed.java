package polymorphism.music3;

import polymorphism.music.Note;

/**
 * 1.0v created by wujf on 2020-12-29
 */
public class Stringed  extends  Instrument{
  @Override
  void play(Note n) {
    System.out.println("Stringed.play()"+n);
  }

  @Override
  String what() {
    return "Stringed";
  }

  @Override
  void adjust() {
    System.out.println("Adjust Stringed");
  }
}
