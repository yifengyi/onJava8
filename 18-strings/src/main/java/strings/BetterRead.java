package strings;

import java.util.Scanner;

/**
 * 1.0v created by wujf on 2021-1-8
 */
public class BetterRead {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(SimpleRead.in);
    System.out.println("What is your name?");
    String name = stdin.nextLine();
    System.out.println(name);
    System.out.println(
            "How old are you? What is your favorite double?");
    System.out.println("(input: <age> <double>)");
    int age = stdin.nextInt();
    double favorite = stdin.nextDouble();
    System.out.println(age);
    System.out.println(favorite);
    System.out.format("Hi %s.%n", name);
    System.out.format("In 5 years you will be %d.%n",
            age + 5);
    System.out.format("My favorite double is %f.",
            favorite / 2);
  }
}