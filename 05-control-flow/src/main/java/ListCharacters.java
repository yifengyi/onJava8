/**
 * V1.0 created by wujf  on  2020-12-27
 */
public class ListCharacters {
    public static void main(String[] args) {
        for (char c=0;c<128;c++){
            if(Character.isLowerCase(c)){
                System.out.println("value: " + (int) c + " character: " + c);
            }
        }
    }
}
