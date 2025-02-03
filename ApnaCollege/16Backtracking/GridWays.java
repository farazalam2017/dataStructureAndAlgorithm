/* Find the number of ways to reach from (0,0) to (n-1,m-1) in a n*m Grid, if allowed moves are only right and down */
/* Below approach gives complexity of O(2^(n+m)), exponential */
/* public class GridWays {
  public static int gridWays(int i, int j, int n, int m) {
    //base case
    if (i == n - 1 && j == m - 1) {//condition for last cell
      return 1;
    } else if (i == n || j == n) {//boundary cross condition
      return 0;
    }
    int w1 = gridWays(i + 1, j, n, m);
    int w2 = gridWays(i, j + 1, n, m);
    return w1 + w2;
  }
  public static void main(String[] args) {
    int n = 3;
    int m = 3;
    System.out.println(gridWays(0, 0, n, m));
  }
} */
/* Below approach gives complexity of O(n+m), linear time */
/* In grid of N*M , number of ways will be (N-1+M-1)!/(N-1)!*(M-1)! */
public class GridWays {
  public static long factorial(int N) {
    int result = 1;
    while (N > 0) {
      result = result * N;
      N--;
    }
    return result;
  }

  public static long countWays(int N, int M) {
    long total = factorial(N-1+M-1);
    long total1 = factorial(N-1);
    long total2 = factorial(M-1);
    return total / (total1 * total2);
  }
public static void main(String[] args) {
  int n = 3;
  int m = 3;
  System.out.print("Ways:- " + countWays(n, m));
}
}