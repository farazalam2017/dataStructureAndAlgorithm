import java.util.*;

public class Check {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check for even and odd:- ");
    int num1 = sc.nextInt();
    if (num1 % 2 == 0) {
      System.out.println("Yes it is even");
    } else {
      System.out.println("Yes it is odd");
    }
    sc.close();
  }
}