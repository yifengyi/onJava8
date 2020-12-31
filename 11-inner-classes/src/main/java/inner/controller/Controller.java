package controller;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.0v created by wujf on 2020-12-31
 */
public class Controller {
  private List<Event> eventList = new ArrayList<>();
  public void addEvent(Event c){
    eventList.add(c);
  }
  public void run(){
    while (eventList.size() > 0) {
      for (Event e : new ArrayList<>(eventList)) {
        if (e.ready()) {
          System.out.println(e);
          e.action();
          eventList.remove(e);

        }
      }
    }
  }
}
