package exceptions;

/**
 * V1.0 created by wujf  on  2021-01-02
 */
class BaseException extends Exception{}
class DeriveException extends BaseException{}

public class PreciseRethrow {
    void catcher()throws DeriveException{
        try {
            throw new DeriveException();
        } catch (DeriveException e) {
            throw e;
        }
    }
}
