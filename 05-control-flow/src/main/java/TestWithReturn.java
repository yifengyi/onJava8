/**
 * V1.0 created by wujf  on  2020-12-27
 */
public class TestWithReturn {
    static int test(int testVal,int target){
        if (testVal >target) {
            return +1;
        }
        if(testVal<target){
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5));
        System.out.println(test(5, 10));
        System.out.println(test(5, 5));
    }
}
