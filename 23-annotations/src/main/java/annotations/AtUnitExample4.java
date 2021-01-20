package annotations;

import onjava.ConvertTo;
import onjava.atunit.AtUnit;
import onjava.atunit.Test;
import onjava.atunit.TestObjectCreate;
import onjava.atunit.TestProperty;

import java.util.*;

/**
 * 1.0v created by wujf on 2021-1-20
 */
public class AtUnitExample4 {
  static String theory = "All brontosauruses " +
          "are thin at one end, much MUCH thicker in the " +
          "middle, and then thin again at the far end.";
  private String word;
  private Random rand = new Random(); // Time-based seed
  public AtUnitExample4(String word) {
    this.word = word;
  }
  public String getWord() { return word; }
  public String scrambleWord() {
    List<Character> chars = Arrays.asList(
            ConvertTo.boxed(word.toCharArray()));
    Collections.shuffle(chars, rand);
    StringBuilder result = new StringBuilder();
    for(char ch : chars)
      result.append(ch);
    return result.toString();
  }
  @TestProperty
  static List<String>     input =
          Arrays.asList(theory.split(" "));
  @TestProperty
  static Iterator<String> words = input.iterator();
  @TestObjectCreate
  static AtUnitExample4 create() {
    if(words.hasNext())
      return new AtUnitExample4(words.next());
    else
      return null;
  }
  @Test
  boolean words() {
    System.out.println("'" + getWord() + "'");
    return getWord().equals("are");
  }
  @Test
  boolean scramble1() {
// Use specific seed to get verifiable results:
    rand = new Random(47);
    System.out.println("'" + getWord() + "'");
    String scrambled = scrambleWord();
    System.out.println(scrambled);
    return scrambled.equals("lAl");
  }
  @Test
  boolean scramble2() {
    rand = new Random(74);
    System.out.println("'" + getWord() + "'");
    String scrambled = scrambleWord();
    System.out.println(scrambled);
    return scrambled.equals("tsaeborornussu");
  }

  //param target\classes\annotations\AtUnitExample1
  public static void main(String[] args) {
    AtUnit.main(args);
  }
}
