package enums;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
public class NonEnum {
    public static void main(String[] args) {
        Class<Integer> intClass = Integer.class;
        try {
            for (Integer en : intClass.getEnumConstants()) {
                System.out.println(en);
            }
        } catch (Exception e) {
            System.out.println("Expected: " + e);
        }
    }
}
