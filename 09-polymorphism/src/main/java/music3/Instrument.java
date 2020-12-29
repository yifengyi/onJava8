package music3;

import music.Note;

/**
 * 1.0v created by wujf on 2020-12-29
 */
public class Instrument {
  void play(Note n){
    System.out.println("Instrument.play()"+n);
  }
  String what(){
    return "Instrument";
  }
  void adjust(){
    System.out.println("Adjust Instrument");
  }
}
