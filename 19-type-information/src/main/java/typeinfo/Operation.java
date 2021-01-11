package typeinfo;

import java.util.function.Supplier;

/**
 * 1.0v created by wujf on 2021-1-11
 */
public class Operation {
  public final Supplier<String> description;
  public final Runnable command;

  public Operation(Supplier<String> description, Runnable command) {
    this.description = description;
    this.command = command;
  }
}
