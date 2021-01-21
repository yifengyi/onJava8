package concurrent;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class CatchCompletableExceptions {
  static void handleException(int failcount){
    CompletableExceptions.test("exceptionally", failcount)
            .exceptionally((ex) -> {
              if (ex == null) {
                System.out.println("I don't get it yet");

              }
              return new Breakable(ex.getMessage(), 0);
            })
            .thenAccept(str -> System.out.println("result: " + str));

    CompletableExceptions
            .test("handle", failcount)
            .handle((result, fail) -> {
              if (fail != null) {
                return "Failure recovery object";
              } else {
                return result + "is good";
              }
            })
            .thenAccept(str -> System.out.println("result: " + str));

    CompletableExceptions
            .test("whenComplete", failcount)
            .whenComplete((result, fail) -> {
              if (fail != null) {
                System.out.println("It failed");
              } else {
                System.out.println(result + " ok");
              }
            })
            .thenAccept(r -> System.out.println("result: " + r));
  }

  public static void main(String[] args) {
    System.out.println("**** Failure Mode ****");
    handleException(2);
    System.out.println("***** Success Mode *****");
    handleException(0);
  }
}
