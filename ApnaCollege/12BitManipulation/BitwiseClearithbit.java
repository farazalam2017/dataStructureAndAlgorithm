/* 
 * Rule:- 
 *  n & (!(1<<i))= clear ith bit
 * 
 */
public class BitwiseClearithbit {
  public static int clearithbit(int n, int i) {
    int bitMask = ~(1 << i);
    return n & bitMask;
  }
  public static void main(String[] args) {
    System.out.println(clearithbit(10, 1));
  }
}

