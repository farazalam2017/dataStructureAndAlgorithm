
/* Climbing stairs :- Count ways to reach nth stair. The person can climb either 1 stairs or 2 stairs at a time*/
import java.util.*;

public class two {
  //Recursion
  public static int countWaysRecursion(int n) {
    if (n == 0) {
      return 1;
    }
    if (n < 0) {
      return 0;
    }
    return countWaysRecursion(n - 1) + countWaysRecursion(n - 2);
  }
  //Memoization
    public static int countWaysMemoization(int n, int ways[]) {
    if (n == 0) {
      return 1;
    }
    if (n < 0) {
      return 0;
    }
    if (ways[n] != -1) {//already calculated
      return ways[n];
    }
    ways[n] = countWaysMemoization(n - 1, ways) + countWaysMemoization(n - 2, ways);
    return ways[n];
  }
  //Tabulation
  public static int countWaysTabulation(int n) {
    int dp[] = new int[n + 1];//
    dp[0] = 1;
    //tabulation loop
    for (int i = 1; i <= n; i++) {
      if (i == 1) {
        dp[i] = dp[i - 1];
      } else {
        dp[i] = dp[i - 1] + dp[i - 2];
      }

    }
    return dp[n];
  }

  public static void main(String args[]) {
    int n = 3;
    int ways[] = new int[n + 1];
    Arrays.fill(ways, -1);
    System.out.println(countWaysRecursion(n));
    System.out.println(countWaysMemoization(n, ways));
    System.out.println(countWaysTabulation(n));
  }
} 
