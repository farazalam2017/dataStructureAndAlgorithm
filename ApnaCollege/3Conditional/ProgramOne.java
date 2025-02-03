/* Question 1 : Write a Java program to get a number from the user and print whether it is
positive or negative. */
import java.util.*;
public class ProgramOne {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    if (num1 < 0) {
      System.out.println("Number is negative");
    } else if (num1 > 0) {
      System.out.println("Number is positive");
    } else {
      System.out.println("Number is zero");
    }
    sc.close();
  }
}