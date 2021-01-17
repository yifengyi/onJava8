package arrays.jmh;

import onjava.Rand;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import java.util.Arrays;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
@State(Scope.Thread)
public class ParallelSort {

    private long[] la;

    @Setup
    public void setup(){
        la = new Rand.Plong().array(100_00);
    }
    @Benchmark
    public void sort(){
        Arrays.sort(la);
    }
    @Benchmark
    public void parallelSort(){
        Arrays.parallelSort(la);
    }
}
