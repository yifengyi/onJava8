package music5;

import music.Note;

/**
 * 1.0v created by wujf on 2020-12-29
 */
interface Instrument{
  int VALUE = 5;
  default void play(Note n){
    System.out.println(this + ".play() " + n);
  }
  default void adjust(){
    System.out.println("Adjusting " + this);
  }
}
class Wind implements Instrument{
  @Override
  public String toString() {

    return "Wind";
  }
}
class Percussion implements Instrument{
  @Override
  public String toString() {
    return "Percussion";
  }
}
class Stringed implements Instrument{
  @Override
  public String toString() {
    return "Stringed";
  }
}
class Brass extends Wind{
  @Override
  public String toString() {
    return "Brass";
  }
}
class Woodwind extends Wind{
  @Override
  public String toString() {
    return "Woodwind";
  }
}
public class Music5 {
  static  void tune(Instrument i){
    i.play(Note.MIDDLE_C);
  }
  static void tuneAll(Instrument[] e){
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
