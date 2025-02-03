import java.util.*;
public class Average {
  public static int Avg(int num) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    for (int i = 1; i <= num; i++) {
      System.out.println("Enter the number:- ");
      int num1 = sc.nextInt();
      sum = sum + num1;
    }
    sc.close();
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num2 = sc.nextInt();
    System.out.println("Average is:- "+ Avg(num2)/num2);
    sc.close();
  }
}
