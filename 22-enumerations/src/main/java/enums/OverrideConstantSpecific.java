package enums;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
public enum OverrideConstantSpecific {
    NUT,BOLT,
    WASHER{
        @Override
        void f() {
            System.out.println("Overridden method");
        }
    }
    ;
    void f(){
        System.out.println("default behavior");
    }

    public static void main(String[] args) {
        for (OverrideConstantSpecific ocs : values()) {
            System.out.print(ocs + ": ");
            ocs.f();
        }
    }
}