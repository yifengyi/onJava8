package arrays;

import onjava.ArrayShow;
import onjava.Rand;

import java.util.Arrays;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
public class ModifyExisting {
    public static void main(String[] args) {
        double[] da = new double[7];
        Arrays.setAll(da,new Rand.Double()::get);
        ArrayShow.show(da);
        Arrays.setAll(da,n->da[n]/100);
        ArrayShow.show(da);
    }
}
