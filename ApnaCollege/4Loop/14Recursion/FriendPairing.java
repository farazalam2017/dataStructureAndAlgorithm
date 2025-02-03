/* Given n friends each one can remain single or can be paired up with some other friend. Each friend can be paired only once.Find out total number of ways in which friends remain single or can be paired up. */
public class FriendPairing {
  public static int friendPairing(int n) {
    if (n == 1 || n == 2) {
      return n;
    } //single
      int fnm1 = friendPairing(n - 1);
      //pair
      int fnm2 = friendPairing(n - 2);
      int pairways = (n - 1) * fnm2;
      int totalWays = fnm1 + pairways;
      return totalWays;
    
  }

  public static void main(String[] args) {
    System.out.println(friendPairing(7));
  }
}
