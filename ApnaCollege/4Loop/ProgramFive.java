/* Question 4 : Write a program to print the multiplication table of a number N, entered by the
user. */
import java.util.*;
public class ProgramFive {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:- ");
    int num= sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + "*" + i + "=" + (i * num));
    }
    sc.close();
  }
}
