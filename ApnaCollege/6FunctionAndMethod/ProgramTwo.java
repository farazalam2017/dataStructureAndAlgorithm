/* Question 2 : Write a Java program to check if a number is a palindrome in Java? */
import java.util.*;
public class ProgramTwo {
  public static boolean CheckPalindrome(int num) {
    int reverse = 0;
    int n = num;
    while (n > 0) {
      int ldigit = n % 10;
      reverse = reverse * 10 + ldigit;
      n = n / 10;
    }
    if (reverse == num) {
      return true;
    } else {
      return false;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:- ");
    int num = sc.nextInt();
    System.out.println(CheckPalindrome(num));
    sc.close();
  }
}
