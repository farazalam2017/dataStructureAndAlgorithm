/* Question 3 : Write a program to find the factorial of any number entered by the user. */
import java.util.*;
public class ProgramFour {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to get the factorial:- ");
    long num1 = sc.nextLong();
    long factorial=1;
    for (int i = 1; i <=num1; i++) {
      factorial = factorial * i;
    }
    System.out.println("Factorial of entered number is: " + factorial);
    sc.close();
    }
}
