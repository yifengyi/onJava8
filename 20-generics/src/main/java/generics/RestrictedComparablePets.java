package generics;

/**
 * V1.0 created by wujf  on  2021-01-16
 */
class Hamster extends ComparablePet implements Comparable<ComparablePet>{
    @Override
    public int compareTo(ComparablePet o) {
        return 0;
    }
}

class Gecko extends ComparablePet{
    @Override
    public int compareTo(ComparablePet o) {
        return 0;
    }
}
public class RestrictedComparablePets {
}
