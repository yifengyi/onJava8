package music3;

import music.Note;

/**
 * 1.0v created by wujf on 2020-12-29
 */
public class Music3 {
  public static void tune(Instrument i){
    i.play(Note.MIDDLE_C);
  }

  public static void tuneAll(Instrument[] e){
    for (Instrument i : e) {
      tune(i);
    }
  }

  public static void main(String[] args) {
    Instrument[] ins = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
    };
    tuneAll(ins);
  }
}
