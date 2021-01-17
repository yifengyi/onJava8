package enums;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
enum LikeClasses{
    WINKEN{
        @Override
        void behavior() {
            System.out.println("Behavior1");
        }
    },
    BLINKEN{
        @Override
        void behavior() {
            System.out.println("Behavior2");
        }
    },
    NOD{
        @Override
        void behavior() {
            System.out.println("Behavior3");
        }
    }
    ;
    abstract void behavior();
}
public class NotClasses {
    //void f1(LikeClasses.WINKEN INSTANCE){}
}
