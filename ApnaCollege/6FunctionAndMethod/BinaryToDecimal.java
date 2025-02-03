 import java.util.*;

public class BinaryToDecimal {

  public static int binToDecimal(int num) {
    int pow = 0;
    int decNum = 0;
    while (num > 0) {
      int ldigit = num % 10;
      decNum = decNum + (ldigit * (int) Math.pow(2, pow));
      pow++;
      num = num / 10;
    }
    return decNum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(binToDecimal(num));
    sc.close();
  }
}

