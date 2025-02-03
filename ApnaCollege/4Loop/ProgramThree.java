/* Question 2 : Write a program that reads a set of integers, and then prints the sum of the even and odd integers. */
import java.util.*;
public class ProgramThree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the count of integer:- ");
    int count = sc.nextInt();
    int sumofEven= 0;
    int sumOfOdd = 0;
    for (int i = 0; i < count; i++) {
      System.out.println("Enter the " + (i + 1) + "Integer");
      int num = sc.nextInt();
      if (num % 2 == 0) {
        sumofEven += num;
      } else {
        sumOfOdd += num;
      }
    }
    System.out.println("Sum of even is:- "+ sumofEven);
    System.out.println("Sum of odd is:- "+ sumOfOdd);
    sc.close();
  }
}
