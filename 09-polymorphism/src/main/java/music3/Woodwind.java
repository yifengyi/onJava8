package music3;

import music.Note;

/**
 * 1.0v created by wujf on 2020-12-29
 */
public class Woodwind extends Instrument {
  @Override
  void play(Note n) {
    System.out.println("Woodwind.play()"+n);
  }

  @Override
  String what() {
    return "Woodwind";
  }

  @Override
  void adjust() {
    System.out.println("Adjust Woodwind");
  }
}
