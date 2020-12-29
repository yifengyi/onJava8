package interfaceprocessor;

/**
 * 1.0v created by wujf on 2020-12-29
 */
public interface Processor {
  default String name(){
    return getClass().getSimpleName();
  }
  Object process(Object input);
}
