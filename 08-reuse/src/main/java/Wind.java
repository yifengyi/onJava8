/**
 * 1.0v created by wujf on 2020-12-28
 */
class Instrument{
  public void play(){
    System.out.println("I'm play");
  }
  static void tune(Instrument i){
    i.play();
  }
}
public class Wind extends Instrument{
  public static void main(String[] args) {
    Wind flute = new Wind();
    Instrument.tune(flute);
  }
}
