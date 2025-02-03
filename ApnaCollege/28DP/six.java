/*Coin Change */
/* Count the number of ways in which change(currency denomination) can be used to generate a given sum */
public class six {
  public static int coinChange(int coins[], int sum) {
    int n = coins.length;
    int dp[][] = new int[n + 1][sum + 1];
    //initialize - sum=0;
    //i-> coins, j->sum/change
    for (int i = 0; i < n + 1; i++) {
      dp[i][0] = 1;/* 0 coin is also a 1 way */
    }
    for (int j = 1; j < sum + 1; j++) {
      dp[0][j] = 0;
    }
    //O(N*sum)
    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < sum + 1; j++) {
        if (coins[i - 1] <= j) {
          dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
        } else {
          dp[i][j] = dp[i - 1][j];
        }
      }
    }
    print(dp);
    return dp[n][sum];
  }
  public static void print(int dp[][]) {
    for (int i = 0; i < dp.length; i++) {
      for (int j = 0; j < dp[0].length; j++) {
        System.out.print(dp[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void main(String args[]) {
    int coins[] = { 2, 5, 3, 6 };
    int sum = 10;//ans= 5
    System.out.println(coinChange(coins, sum));
  }
}
