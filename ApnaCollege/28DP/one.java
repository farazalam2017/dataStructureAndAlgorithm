/* Introduction to DP */
public class one {
  //Recursion
  public static int fibRecursion(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    return fibRecursion(n - 1) + fibRecursion(n - 2);

  }
  //Memoization
  public static int fibMemoization(int n, int fTemp[]) {
    if (n == 0 || n == 1) {
      return n;
    }
    if (fTemp[n] != 0) {//fibMemoization(n) is already calculated
      return fTemp[n];

    }
    fTemp[n] = fibMemoization(n - 1, fTemp) + fibMemoization(n - 2, fTemp);
    return fTemp[n];
  }
  //Tabulation
 public static int fibTabulation(int n) {
  int dp[] = new int[n + 1];
  dp[0] = 0;
  dp[1] = 1;
  for (int i = 2; i <= n; i++) {
    dp[i] = dp[i - 1] + dp[i - 2];
  }
  return dp[n];
} 
  public static void main(String args[]) {
    int n = 7;
    int fTemp[] = new int[n + 1];
    System.out.println("Nth Fibonacci number using resursion is:- "+" "+fibRecursion(n));
    System.out.println("Nth Fibonacci number using Memoization is:- "+" "+fibMemoization(n, fTemp));
    System.out.println("Nth Fibonacci number using tabulation is:- "+" "+fibTabulation(n));
  }
}