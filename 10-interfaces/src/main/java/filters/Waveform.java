package filters;

/**
 * 1.0v created by wujf on 2020-12-29
 */
public class Waveform {
  private static long counter;
  private final long id = counter++;

  @Override
  public String toString() {

    return "Waveform " + id;
  }
}
