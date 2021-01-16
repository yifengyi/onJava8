package generics;

import onjava.Suppliers;

import java.util.ArrayList;
import java.util.List;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
class Customer{
    private static long counter = 1;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Customer " + id;
    }
}
class Teller{
    private static long counter = 1;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Teller "+id;
    }
}
class Bank{
    private List<BankTeller> tellers = new ArrayList<>();
    public void put(BankTeller bt){
        tellers.add(bt);
    }
}
public class BankTeller {
    public static void serve(Teller t,Customer c){
        System.out.println(t + " serves " + c);
    }

    public static void main(String[] args) {
        RandomList<Teller> tellers =
                Suppliers.create(RandomList::new, Teller::new, 4);
        List<Customer>customers =Suppliers.fill(
                new ArrayList<>(),Customer::new,12
        );
        customers.forEach(c->serve(tellers.select(),c));

        Bank bk = Suppliers.fill(
                new Bank(),Bank::put,BankTeller::new,3
        );

        List<Customer> customers1=Suppliers.fill(
                new ArrayList<>(),
                List::add,Customer::new,12
        );
    }
}
