package interfaces.interfaceprocessor;

import interfaces.filters.*;

/**
 * 1.0v created by wujf on 2020-12-29
 */
class FilterAdapter implements Processor {
  Filter filter;

  FilterAdapter(Filter filter) {
    this.filter = filter;
  }

  @Override
  public Waveform process(Object input) {
    return filter.process(((Waveform) input));
  }

  @Override
  public String name() {
    return filter.name();
  }
}

public class FilterProcessor {
  public static void main(String[] args) {
    Waveform w = new Waveform();
    Applicator.apply(new FilterAdapter(new LowPass(1.0)), w);
    Applicator.apply(new FilterAdapter(new HighPass(2.0)), w);
    Applicator.apply(new FilterAdapter(new BandPass(3.0, 4.0)), w);
  }
}
