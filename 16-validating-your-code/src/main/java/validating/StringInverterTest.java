package validating;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

/**
 * 1.0v created by wujf on 2021-1-6
 */
public class StringInverterTest {
  StringInverter inverter = new Inverter4();

  @BeforeAll
  static void startMsg(){
    System.out.println(">>> StringInverterTest start <<<");
  }
  @Test
  void basicInversion1(){
    String in = "Exit, Pursued by a Bear.";
    String out = "eXit, pURSUED BY A bEAR.";
    Assertions.assertEquals(inverter.invert(in),out);
  }
  @Test
  void basicInversion2(){
    Assertions.assertThrows(Error.class, () -> {
      Assertions.assertEquals(inverter.invert("X"), "X");
    });
  }
  @Test
  void disallowedCharacters(){
    String disallowed = ";-_()*&^%$#@!~`0123456789";
    String result = disallowed.chars()
            .mapToObj(c -> {
              String cc = Character.toString((char) c);
              try {
                inverter.invert(cc);
                return "";
              } catch (RuntimeException e) {
                return cc;

              }
            }).collect(Collectors.joining(""));
    Assertions.assertEquals(result,disallowed);

  }
  @Test
  void allowedCharacters(){
    String lowcase = "abcdefghijklmnopqrstuvwxyz ,.";
    String upcase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ,.";
    Assertions.assertEquals(inverter.invert(lowcase),upcase);
    Assertions.assertEquals(inverter.invert(upcase),lowcase);
  }
}
