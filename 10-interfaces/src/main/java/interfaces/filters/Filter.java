package interfaces.filters;

/**
 * 1.0v created by wujf on 2020-12-29
 */
public class Filter {
  public String name(){
    return getClass().getSimpleName();
  }
  public Waveform process(Waveform input){
    return input;
  }
}
