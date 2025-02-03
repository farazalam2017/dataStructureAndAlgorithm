/* 
 * Count the number of set bit(bit that is 1) in a number
 * example:- 10= 1010= i.e= 2
 */
public class CountSetBit {
  public static int count(int n) {
    int cnt = 0;
    while (n > 0) {
      if ((n & 1) != 0) {
        cnt++;
      }
      n = n >> 1;
    }
    return cnt;
  }
  public static void main(String[] args) {
    System.out.println("Number of set bit in number is:- " + count(15));
  }
}
