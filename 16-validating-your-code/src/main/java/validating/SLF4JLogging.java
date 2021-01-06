package validating;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 1.0v created by wujf on 2021-1-6
 */
public class SLF4JLogging {
  private static Logger log =
          LoggerFactory.getLogger(SLF4JLogging.class);

  public static void main(String[] args) {
    log.info("hello logging");
  }
}
