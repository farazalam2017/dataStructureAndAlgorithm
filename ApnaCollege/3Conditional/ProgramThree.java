/* Question 5 : Write a Java program that takes a year from the user and print whether that year is a leap year or not. */
import java.util.*;
public class ProgramThree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if (year % 400 == 0) {
      System.out.println("Leap year");
    } else if (year % 100 == 0) {
      System.out.println("Not a Leap year");
    } else if (year % 4 == 0) {
      System.out.println("Leap year");
    } else {
      System.out.println("Not a Leap year");
    }
    sc.close();
    
  }
}
