package music;

/**
 * 1.0v created by wujf on 2020-12-28
 */
public class Music2 {
  public static void tune(Wind i){
    i.play(Note.MIDDLE_C);
  }
  public static void tune(Stringed i){
    i.play(Note.MIDDLE_C);
  }
  public static void tune(Brass i){
    i.play(Note.MIDDLE_C);
  }

  public static void main(String[] args) {
    Wind flute = new Wind();
    Stringed violin = new Stringed();
    Brass frenchHorn = new Brass();
    tune(flute);
    tune(violin);
    tune(frenchHorn);
  }
}
