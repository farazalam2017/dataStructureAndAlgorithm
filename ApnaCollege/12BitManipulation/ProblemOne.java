/* Check for even or odd using bitwise operator 
 * n (& 1)= LSB= 0(even) or 1(odd) 
 * 
*/
import java.util.*;
public class ProblemOne {
  public static void oddorEven(int n) {
    int bitMask = 1;//or 1 << 0
    if ((n & bitMask) == 0) {
      System.out.println("Number is even");
    } else {
      System.out.println("Number is odd");
      
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    oddorEven(num);
    sc.close();
  }
}
