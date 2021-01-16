package generics;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
public class Shape {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName()+" "+id;
    }
    public void rotate(){
        System.out.println(this + " rotate");
    }
    public void resize(int newSize){
        System.out.println(this + " resize " + newSize);
    }
}
