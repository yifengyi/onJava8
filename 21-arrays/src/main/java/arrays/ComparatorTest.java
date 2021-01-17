package arrays;

import java.util.Arrays;
import java.util.Comparator;

import static onjava.ArrayShow.show;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
class CompTypeComparator implements Comparator<CompType>{
    @Override
    public int compare(CompType o1, CompType o2) {
        return (o1.j < o2.j ? -1 : (o1.j == o2.j ? 0 : 1));
    }
}
public class ComparatorTest {
    public static void main(String[] args) {
        CompType[] a = new CompType[12];
        Arrays.setAll(a,n->CompType.get());
        show("Before sorting",a);
        Arrays.sort(a,new CompTypeComparator());
        show("After sorting",a);


    }
}
