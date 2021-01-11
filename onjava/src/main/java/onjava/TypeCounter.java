package onjava;

import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * 1.0v created by wujf on 2021-1-11
 */
public class TypeCounter extends HashMap<Class<?>, Integer> {
  private Class<?> baseType;

  public TypeCounter(Class<?> baseType) {
    this.baseType = baseType;
  }

  public void count(Object obj) {
    Class<?> type = obj.getClass();
    if (!baseType.isAssignableFrom(type)) {
      throw new RuntimeException(
              obj + " incorrect type: " + type +
                      ", should be type or subtype of " + baseType
      );
    }
    countClass(type);
  }
  private void countClass(Class<?> type){
    Integer qty = get(type);
    put(type, qty == null ? 1 : qty + 1);
    Class<?> superClass = type.getSuperclass();
    if (superClass != null
            && baseType.isAssignableFrom(superClass)) {
      countClass(superClass);
    }
  }

  @Override
  public String toString() {
    String result = entrySet().stream()
            .map(pair -> String.format("%s=%s",
                    pair.getKey().getSimpleName(),
                    pair.getValue()))
            .collect(Collectors.joining(", "));
    return result;
  }
}
