import java.util.*;

public class Input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();//to take single word without space
    System.out.println(str);
    String str1 = sc.nextLine();//to take word with spaces
    System.out.println(str1);
    int num1 = sc.nextInt();//to take integer as input
    System.out.println(num1);
    byte num2 = sc.nextByte();//to take byte as input
    System.out.println(num2);
    boolean bool1 = sc.nextBoolean();//to take boolean as input
    System.out.println(bool1);
    short short1 = sc.nextShort();//to take short as input
    System.out.println(short1);
    long long1 = sc.nextLong();//to take long as input
    System.out.println(long1);
    sc.close();
  }
}