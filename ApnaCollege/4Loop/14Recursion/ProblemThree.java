/* WAP to calculate x ^ n */
public class ProblemThree {
  //brute way, complexity O(n)
 /*  public static int power(int x, int n) {
  if (n == 0) {
    return 1;
  }
  return x * power(x, n - 1);
 } */
 ///////////////////
 //optimal way, complexity O(log n)
 public static int optimalPower(int a, int n) {
   if (n == 0) {
     return 1;
   }
   int halfPower = optimalPower(a, n / 2);
   int halfP = halfPower * halfPower;
   if (n % 2 != 0) {
     halfP = a * halfP;
   }
   return halfP;
  }
  public static void main(String[] args) {
    System.out.println(optimalPower(6,4));
  }
}
