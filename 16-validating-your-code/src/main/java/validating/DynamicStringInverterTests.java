package validating;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1.0v created by wujf on 2021-1-6
 */
public class DynamicStringInverterTests {
  Stream<DynamicTest> testVersions(String id,
                                   Function<StringInverter,String> test){
    List<StringInverter> versions = Arrays.asList(
      new Inverter1(),new Inverter2(),new Inverter3(),new Inverter4()
    );
    return DynamicTest.stream(
            versions.iterator(),
            inverter->inverter.getClass().getSimpleName(),
            inverter ->{
              System.out.println(
                      inverter.getClass().getSimpleName()+": "+id);

              try {
                if (!Objects.equals(test.apply(inverter), "fail")) {
                  System.out.println("Success");
                }
              } catch (Exception |Error e) {
                System.out.println("Exception: " + e.getMessage());
              }
            }
    );
  }
  String isEquals(String lval,String rval){
    if (lval.equals(rval)) {
      return "success";
    }
    System.out.println("FAIL: " + lval + " != " + rval);
    return "fail";
  }

  @BeforeAll
  static void startMsg(){
    System.out.println(">>> Starting DynamicStringInverterTest<<<");
  }

  @AfterAll
  static void endMsg(){
    System.out.println(">>> Finished DynamicStringInverterTest<<<");
  }
  @TestFactory
  Stream<DynamicTest> basicInversion1(){
    String in = "Exit, Pursued by a Bear.";
    String out = "eXit,pURSUED BY A bEAR.";

    return testVersions("Basic inversion (should succeed)",
            inverter->isEquals(inverter.invert(in),out));
  }

  @TestFactory
  Stream<DynamicTest> basicInversion2(){
    return testVersions("Basic inversion (should fail)",
            inverter->isEquals(inverter.invert("X"),"X"));

  }

  @TestFactory
  Stream<DynamicTest> disallowedCharacters(){
    String disallowed = ";-_()*&ˆ%$#@!~`0123456789";
    return testVersions(
            "Disallowed characters",
            inverter->{
              String result = disallowed.chars()
                      .mapToObj(c->{
                        String cc = Character.toString((char) c);
                        try {
                          inverter.invert(cc);
                          return "";
                        } catch (RuntimeException e) {
                          return cc;
                        }
                      }).collect(Collectors.joining(""));
              if (result.length() == 0) {
                return "success";
              }
              System.out.println("Bad characters: " + result);
              return "fail";

            }
    );
  }
  @TestFactory
  Stream<DynamicTest> allowedCharacters(){
    String lowcase = "abcdefghijklmnopqrstuvwxyz ,.";
    String upcase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ,.";
    return testVersions(
            "Allowed characteres (should succeed)",
            inverter->{
              Assertions.assertEquals(inverter.invert(lowcase),upcase);
              Assertions.assertEquals(inverter.invert(upcase),lowcase);
              return "success";
            }
    );
  }
  @TestFactory
  Stream<DynamicTest> lengthNoGreaterThan30(){
    String str = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
    Assertions.assertTrue(str.length()>30);
    return testVersions(
            "Length must be lese than 31(throw exception)",
            inverter -> inverter.invert(str)
    );
  }
  @TestFactory
  Stream<DynamicTest> lengthLessThan31(){
    String str = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
    Assertions.assertTrue(str.length()<31);
    return testVersions(
            "Length must be lese than 31(throw succeed)",
            inverter -> inverter.invert(str)
    );
  }
}
