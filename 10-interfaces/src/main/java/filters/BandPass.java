package filters;

/**
 * 1.0v created by wujf on 2020-12-29
 */
public class BandPass extends Filter {
  double lowCutoff,highCutoff;

  public BandPass(double lowCutoff, double highCutoff) {
    this.lowCutoff = lowCutoff;
    this.highCutoff = highCutoff;
  }

  @Override
  public Waveform process(Waveform input) {
    return input;
  }
}
