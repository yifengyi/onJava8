package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * V1.0 created by wujf  on  2021-01-01
 */
public class Closure9 {
    Supplier<List<Integer>> makeFun(){
        List<Integer> ai = new ArrayList<>();
        ai = new ArrayList<>();
        //return ()->ai;
        return () -> Arrays.asList(1);
    }
}
