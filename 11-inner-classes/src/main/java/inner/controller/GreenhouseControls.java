package controller;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public class GreenhouseControls extends Controller {
  private boolean light = false;
  public class LightOn extends Event{


    public LightOn(long delayTme) {
      super(delayTme);
    }

    @Override
    public void action() {
      light = true;
    }

    @Override
    public String toString() {
      return "Light is on";
    }
  }

  public class LightOff extends Event{
    public LightOff(long delayTme) {
      super(delayTme);
    }

    @Override
    public void action() {
      light = false;

    }

    @Override
    public String toString() {
      return "Light is off";
    }
  }
  private boolean water = false;
  public class WaterOn extends Event{
    public WaterOn(long delayTme) {
      super(delayTme);
    }

    @Override
    public void action() {
      water = true;
    }

    @Override
    public String toString() {
      return "Greenhouse water is on";
    }
  }

  public class WaterOff extends Event{
    public WaterOff(long delayTme) {
      super(delayTme);
    }

    @Override
    public void action() {
      water =false;
    }

    @Override
    public String toString() {
      return "Greenhouse water is off";
    }
  }

  private String thermostat = "Day";
  public class ThermostatNight extends Event{
    public ThermostatNight(long delayTme) {
      super(delayTme);
    }

    @Override
    public void action() {
      thermostat = "Night";
    }

    @Override
    public String toString() {
      return "Thermostat on night setting";
    }
  }
  public class ThermostatDay extends Event{
    public ThermostatDay(long delayTme) {
      super(delayTme);
    }

    @Override
    public void action() {
      thermostat = "Day";
    }

    @Override
    public String toString() {
      return "Thermostat on day setting";
    }
  }
  public class Bell extends Event{
    public Bell(long delayTme) {
      super(delayTme);
    }

    @Override
    public void action() {
      addEvent(new Bell(delayTime.toMillis()));
    }

    @Override
    public String toString() {
      return "Bing!";
    }
  }
  public class Restart extends Event{
    private Event[] eventList;
    public Restart(long delayTme,Event[] eventList) {
      super(delayTme);
      this.eventList = eventList;
      for (Event e : eventList) {
        addEvent(e);
      }
    }

    @Override
    public void action() {
      for (Event e : eventList) {
        e.start();
        addEvent(e);
      }
      start();
      addEvent(this);
    }

    @Override
    public String toString() {
      return "Restarting system";
    }
  }
  public static class Terminate extends Event{
    public Terminate(long delayTme) {
      super(delayTme);
    }

    @Override
    public void action() {
      System.exit(0);
    }

    @Override
    public String toString() {
      return "Terminating";
    }
  }
}
