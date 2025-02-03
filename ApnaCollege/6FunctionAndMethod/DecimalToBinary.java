import java.util.*;
public class DecimalToBinary {
  public static int Test(int num2) {
    int num = num2;
    int pow = 0;
    int binNum = 0;
    while (num > 0) {
      int ldigit = num % 2;
      binNum = binNum + (ldigit * (int) Math.pow(10, pow));
      pow++;
      num = num / 2;
    }
    return binNum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    System.out.println(Test(num1));
    sc.close();
  }
}
