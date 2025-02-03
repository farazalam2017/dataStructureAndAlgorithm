/* 
 * To clear range of bits
 * n & (a|b) where
 * a=((~0)<<(j+1))
 * b=(1<<i)-1;
 * 
 */
public class ClearInRange {
  public static int test(int n, int i, int j) {
    int a = ((~0) << (j + 1));
    int b = (1 << i) - 1;
    int bitMask = a | b;
    return n & bitMask;
  }
  public static void main(String[] args) {
    System.out.println(test(10, 2, 4));
  }
}
