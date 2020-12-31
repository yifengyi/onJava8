package interfaces.filters;

/**
 * 1.0v created by wujf on 2020-12-29
 */
public class HighPass extends Filter {
  double cutoff;

  public HighPass(double cutoff){
    this.cutoff = cutoff;
  }

  @Override
  public Waveform process(Waveform input) {
    return input;
  }
}
