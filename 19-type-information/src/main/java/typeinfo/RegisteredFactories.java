package typeinfo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 1.0v created by wujf on 2021-1-11
 */
class Part implements Supplier<Part>{
  @Override
  public String toString() {
    return getClass().getSimpleName();
  }

  private static List<Supplier<? extends Part>> prototypes =
          Arrays.asList(
                  new FuelFilter(),
                  new AirFilter(),
                  new CabinAirFilter(),
                  new OilFilter(),
                  new FanBelt(),
                  new PowerSteeringBelt(),
                  new GeneratorBelt()
          );
  private static Random rand = new Random(47);

  @Override
  public Part get() {
    int n = rand.nextInt(prototypes.size());

    return prototypes.get(n).get();
  }
}
class Filter extends Part{}
class FuelFilter extends Filter{
  @Override
  public FuelFilter get() {
    return new FuelFilter();
  }
}
class AirFilter extends  Filter{
  @Override
  public AirFilter get() {
    return new AirFilter();
  }
}
class CabinAirFilter extends Filter{
  @Override
  public CabinAirFilter get() {
    return new CabinAirFilter();
  }
}
class OilFilter extends Filter{
  @Override
  public OilFilter get() {
    return new OilFilter();
  }
}
class Belt extends  Part{}
class FanBelt extends  Belt{
  @Override
  public FanBelt get() {
    return new FanBelt();
  }
}
class GeneratorBelt extends Belt{
  @Override
  public GeneratorBelt get() {
    return new GeneratorBelt();
  }
}
class PowerSteeringBelt extends Belt{
  @Override
  public PowerSteeringBelt get() {
    return new PowerSteeringBelt();
  }
}
public class RegisteredFactories {
  public static void main(String[] args) {
    Stream.generate(new Part())
            .limit(10)
            .forEach(System.out::println);
  }
}
