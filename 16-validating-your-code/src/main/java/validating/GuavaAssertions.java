package validating;

import com.google.common.base.Verify;
import com.google.common.base.VerifyException;

/**
 * 1.0v created by wujf on 2021-1-6
 */
public class GuavaAssertions {
  public static void main(String[] args) {
    Verify.verify(2+2==4);

    try {
      Verify.verify(1+2 ==4);
    } catch (VerifyException e) {
      System.out.println(e);
    }

    try {
      Verify.verify(1+2 ==4,"Bad math");

    } catch (VerifyException e) {
      System.out.println(e.getMessage());
    }
    try {
      Verify.verify(1+2 ==4,"Bad math:%s ","not 4");

    } catch (VerifyException e) {
      System.out.println(e.getMessage());
    }

    String s = "";
    s = Verify.verifyNotNull(s);
    s = null;
    try {
      Verify.verifyNotNull(s);
    } catch (VerifyException e) {
      System.out.println(e.getMessage());
    }
    try {
      Verify.verifyNotNull(s,"Shouldn't be null:%s ","arg s ");

    } catch (VerifyException e) {
      System.out.println(e.getMessage());
    }

  }
}
