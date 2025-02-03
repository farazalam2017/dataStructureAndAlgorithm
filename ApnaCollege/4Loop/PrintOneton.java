import java.util.*;
public class PrintOneton {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n:- ");
    int num1 = sc.nextInt();
    int count = 1;
    while (count <= num1) {
      System.out.println(count);
      count++;
    }
    sc.close();
  }
}
