package arrays;

import java.util.Arrays;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
public class MultidimensionalObjectArrays {
    public static void main(String[] args) {
        BerylliumSphere[][] spheres=
                {
                        {new BerylliumSphere(),new BerylliumSphere()},
                        {new BerylliumSphere(),new BerylliumSphere(),
                        new BerylliumSphere(),new BerylliumSphere()},

                        {
                            new BerylliumSphere(),new BerylliumSphere(),
                            new BerylliumSphere(),new BerylliumSphere(),
                            new BerylliumSphere(),new BerylliumSphere(),
                            new BerylliumSphere(),new BerylliumSphere()
                        }

                };
        System.out.println(Arrays.deepToString(spheres));
    }
}
