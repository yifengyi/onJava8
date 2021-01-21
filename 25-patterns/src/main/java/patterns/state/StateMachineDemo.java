package patterns.state;

import onjava.Nap;

/**
 * 1.0v created by wujf on 2021-1-21
 */
interface State {
  void run();
}

abstract class StateMachine {
  protected State currentState;

  protected abstract boolean changeState();

  protected final void runAll() {
    while (changeState()) {
      currentState.run();
    }
  }
}

class Wash implements State {
  @Override
  public void run() {
    System.out.println("Washing");
    new Nap(0.5);
  }
}

class Spin implements State {
  @Override
  public void run() {
    System.out.println("Spinning");
    new Nap(0.5);
  }
}

class Rinse implements State {
  @Override
  public void run() {
    System.out.println("Rinsing");
    new Nap(0.5);
  }
}

class Washer extends StateMachine {
  private int     i      = 0;
  private State[] states = {
          new Wash(), new Spin(),
          new Rinse(), new Spin(),
  };

  Washer() {
    runAll();
  }

  @Override
  protected boolean changeState() {
    if (states.length > i) {
      currentState = states[i++];
      return true;
    } else {
      return false;
    }
  }
}

public class StateMachineDemo {
  public static void main(String[] args) {
    new Washer();
  }
}
