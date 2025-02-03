import java.util.*;
public class ReverseNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:- ");
    int num1 = sc.nextInt();
    int reverse = 0;
    while (num1 != 0) {
      int lastdigit = num1 % 10;
      reverse = reverse * 10 + lastdigit;
      num1 = num1 / 10;
    }
    System.out.println("Reverse of a number is:- " + reverse);
    sc.close();
  }
}
