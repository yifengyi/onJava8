package concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

/**
 * 1.0v created by wujf on 2021-1-21
 */
public class ThrowsChecked {
  class Checked extends Exception{}
  static ThrowsChecked nochecked(ThrowsChecked tc){
    return tc;
  }
  static ThrowsChecked withchecked(ThrowsChecked tc)throws Checked {
    return tc;
  }

  static void testStream(){
    Stream.of(new ThrowsChecked())
            .map(ThrowsChecked::nochecked)
            // .map(ThrowsChecked::withchecked)
            .map(tc->{
              try {
                return withchecked(tc);
              } catch (Checked checked) {
                throw new RuntimeException(checked);
              }
            });
  }
  static void testCompletableFuture(){
    CompletableFuture
            .completedFuture(new ThrowsChecked())
            .thenApply(ThrowsChecked::nochecked)
            // .thenApply(ThrowsChecked::withchecked)
            .thenApply(tc->{
              try {
                return withchecked(tc);
              } catch (Checked checked) {
                throw new RuntimeException(checked);
              }
            });

  }
}
