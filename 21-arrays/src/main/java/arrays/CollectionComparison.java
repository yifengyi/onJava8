package arrays;

import onjava.ArrayShow;
import onjava.Suppliers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
class BerylliumSphere{
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Sphere " + id;
    }
}


public class CollectionComparison {
    public static void main(String[] args) {
        BerylliumSphere[] spheres =
                new BerylliumSphere[10];
        for (int i = 0; i < 5; i++) {
            spheres[i] = new BerylliumSphere();
        }
        ArrayShow.show(spheres);
        System.out.println(spheres[4]);

        List<BerylliumSphere>sphereList = Suppliers.create(
                ArrayList::new,BerylliumSphere::new,5
        );
        System.out.println(sphereList);
        System.out.println(sphereList.get(4));


        int[] integers = {0, 1, 2, 3, 4, 5};
        ArrayShow.show(integers);
        System.out.println(integers[4]);

        List<Integer> intList = new ArrayList<>(
                Arrays.asList(0, 1, 2, 3, 4, 5)
        );
        intList.add(97);
        System.out.println(intList);
        System.out.println(intList.get(4));
    }
}
