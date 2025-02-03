/* 
 * Rule:-
 * n | (1<<i) = set ith bit 1
 * 
 */
public class BitwiseSetith {
  public static int Setithbit(int n, int i) {
    int bitMask = 1 << i;
    return n | bitMask;
  }
  public static void main(String[] args) {
    System.out.println(Setithbit(9,2 ));
  }
}
 