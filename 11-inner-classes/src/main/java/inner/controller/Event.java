package controller;

import java.time.Duration;
import java.time.Instant;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public abstract class Event {
  private Instant eventTime;

  protected final Duration delayTime;

  public Event(long millisecondDelay){
    delayTime = Duration.ofMillis(millisecondDelay);
    start();
  }

  public void start(){
    eventTime = Instant.now().plus(delayTime);
  }

  public boolean ready(){
    return Instant.now().isAfter(eventTime);
  }
  public abstract  void action();
}
