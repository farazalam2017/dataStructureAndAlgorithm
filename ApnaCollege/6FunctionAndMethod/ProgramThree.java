/* Write a Java method to compute the sum of the digits in an integer. */
import java.util.*;
public class ProgramThree {
  public static int Sum(int num) {
    int sum = 0;
    while (num > 0) {
      int ldigit = num % 10;
      sum = sum + ldigit;
      num = num / 10;
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number:- ");
    int num= sc.nextInt();
    System.out.println("Sum of digit of entered number is:- "+Sum(num));
    sc.close();
  }
}
