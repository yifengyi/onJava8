package interfaces;

import onjava.Operations;

/**
 * 1.0v created by wujf on 2020-12-29
 */
class Bing implements Operations{
  @Override
  public void execute() {
    Operations.show("interfaces.Bing");
  }
}
class Crack implements Operations{
  @Override
  public void execute() {
    Operations.show("interfaces.Crack");
  }
}
class Twist implements Operations{
  @Override
  public void execute() {
    Operations.show("interfaces.Twist");
  }
}

public class Machine {
  public static void main(String[] args) {
    Operations.runOps(
            new Bing(),new Crack(),new Twist()
    );
  }
}
