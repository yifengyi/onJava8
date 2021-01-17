package enums;

/**
 * V1.0 created by wujf  on  2021-01-17
 */
enum Search{
    HITHER,YON
}
public class UpcastEnum {
    public static void main(String[] args) {
        Search[] vals = Search.values();
        Enum e = Search.HITHER;
// e.values(); // No values() in Enum
        for (Enum en : e.getClass().getEnumConstants()) {
            System.out.println(en);
        }

    }
}
