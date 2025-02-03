public class KdaneAlgorithm {
  public static void kdane(int number[]) {
    int maxSum = Integer.MIN_VALUE;
    int curSum = 0;
    for (int i = 0; i < number.length; i++) {
      curSum = curSum + number[i];
      if (curSum < 0) {
        curSum = 0;
      }
      maxSum = Math.max(curSum, maxSum);
    }
    System.out.println("Our max subarray is:- " + maxSum);
  }
  public static void main(String[] args) {
    int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
    kdane(numbers);
  }
}
