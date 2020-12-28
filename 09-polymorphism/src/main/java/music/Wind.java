package music;

/**
 * 1.0v created by wujf on 2020-12-28
 */
class Instrument {
  public void play(Note n){
    System.out.println("Instrument.play()");
  }
}
class Stringed extends Instrument{
  @Override
  public void play(Note n){
    System.out.println("Stringed.play()" + n);
  }
}
class Brass extends Instrument{
  @Override
  public void play(Note n){
    System.out.println("Brass.play()" + n);
  }
}
public class Wind extends Instrument{
  @Override
  public void play(Note n){
    System.out.println("Wind.play()" + n);
  }

}
