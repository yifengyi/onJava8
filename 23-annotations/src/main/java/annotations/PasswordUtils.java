package annotations;

import java.util.List;

/**
 * 1.0v created by wujf on 2021-1-19
 */
public class PasswordUtils {

  @UseCase(id = 47,description =
          "Passwords must contain at least one numeric")
  public boolean validatePassword(String passwd){
    return (passwd.matches("\\w*\\d\\w*"));
  }

  @UseCase(id = 48)
  public String encryptPassowrd(String passwd){
    return new StringBuilder(passwd).reverse().toString();
  }

  @UseCase(id = 49,description =
          "New passwords can't equals previously used nones")
  public boolean checkForNewPassword(List<String> prevPasswords,
                                     String passwd){
    return !prevPasswords.contains(passwd);
  }
}
