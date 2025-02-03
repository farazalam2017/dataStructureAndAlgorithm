/* 
 * Rule:- n & (1<<i)= 0(ith bit is 0) or !0(ith bit is 1)
 * 
 */
public class BitwiseGetithbit {
  public static int ithbit(int n, int i) {
    int bitMask=1<<i;
    if ((n & bitMask) == 0) {
      return 0;
    } else {
      return 1;
    }
  }
  public static void main(String[] args) {
    System.out.println(ithbit(10,2));
  }
}
