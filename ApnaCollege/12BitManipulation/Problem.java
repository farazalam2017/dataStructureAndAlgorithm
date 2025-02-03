/* Check if number is power of 2 or not 
 * For n numnber which can be expressed as power(2,x) then 
 * n & (n-1)=0 
 * 
*/
public class Problem {
  public static boolean isPowerofTwo(int n) {
    return ((n & (n - 1)) == 0);
  }
  public static void main(String[] args) {
    System.out.println(isPowerofTwo(15));//False
    System.out.println(isPowerofTwo(16));//True
  }
}
