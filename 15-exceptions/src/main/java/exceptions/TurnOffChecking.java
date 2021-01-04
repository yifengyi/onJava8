package exceptions;

import com.sun.javafx.iio.ios.IosDescriptor;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * V1.0 created by wujf  on  2021-01-04
 */
class WrapCheckedException{
    void throwRuntimeException(int type){
        try {
            switch (type) {
                case 0:
                    throw new FileNotFoundException();
                case 1:
                    throw new IOException();
                case 2:
                    throw new RuntimeException();
                    default:return;
            }
        }catch (IOException |RuntimeException e){
            throw new RuntimeException(e);
        }
    }
}
class SomeOtherException extends Exception{

}
public class TurnOffChecking {
    public static void main(String[] args) {
        WrapCheckedException wce =
                new WrapCheckedException();

        wce.throwRuntimeException(3);

        for (int i = 0; i < 4; i++) {
            try {
                if (3>i) {
                    wce.throwRuntimeException(i);
                }else {
                    throw new SomeOtherException();
                }
            } catch (SomeOtherException e) {
                System.out.println("SomeOtherException: " + e);
            }catch (RuntimeException re){
                try {
                    throw re.getCause();
                } catch (FileNotFoundException e) {
                    System.out.println("FileNotFoundException: " + e);
                }catch (IOException e){
                    System.out.println("IOException: " + e);
                }catch (Throwable e){
                    System.out.println("Throwable: " + e);
                }
            }
        }
    }
}
