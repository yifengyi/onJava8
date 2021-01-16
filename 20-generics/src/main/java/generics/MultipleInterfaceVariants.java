package generics;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
interface Payable<T>{}
//class Employee implements Payable<Employee>{}
class Hourly extends Employee implements Payable<Hourly>{}
public class MultipleInterfaceVariants {
}
