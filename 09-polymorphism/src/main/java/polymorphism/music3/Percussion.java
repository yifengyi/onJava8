package polymorphism.music3;

import polymorphism.music.Note;

/**
 * 1.0v created by wujf on 2020-12-29
 */
public class Percussion extends Instrument {
  @Override
  void play(Note n) {
    System.out.println("Percussion.play()"+n);
  }

  @Override
  String what() {
    return "Percussion";
  }

  @Override
  void adjust() {
    System.out.println("Adjust Percussion");
  }
}
