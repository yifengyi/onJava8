package polymorphism.music;

/**
 * 1.0v created by wujf on 2020-12-28
 */
public class Music {
  public static void tune(Instrument i){
    i.play(Note.MIDDLE_C);
  }

  public static void main(String[] args) {
    Wind flute = new Wind();
    tune(flute);
  }
}
