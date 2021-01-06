package validating;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 1.0v created by wujf on 2021-1-6
 */
public class SLF4JLevels {
  private static Logger log =
          LoggerFactory.getLogger(SLF4JLevels.class);

  public static void main(String[] args) {
    log.trace("Hello");
    log.debug("Logging");
    log.info("Using");
    log.warn("the SLF4J");
    log.error("Facade");
  }
}
