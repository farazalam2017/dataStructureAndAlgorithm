/* Display all number entered by user except mutiple of 10 */
import java.util.*;
public class ProblemTwo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Enter the number:- ");
      int num1 = sc.nextInt();
      if (num1 % 10 == 0) {
        continue;
      }
      System.out.println(num1);
    } while (true);
  }
}