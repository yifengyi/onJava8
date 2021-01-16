package generics;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
class GenericType<T>{}
//Java 中的泛型关乎参数和返回类型，因此它能够产生使用导出类
//作为其参数和返回类型的基类
public class CuriouslyRecurringGeneric extends
    GenericType<CuriouslyRecurringGeneric>{


}
