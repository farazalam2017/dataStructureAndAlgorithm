public class MaxSubarraySum {
  public static void maxSubarraySum(int numbers[]) {
    int curSum = 0;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i; j < numbers.length; j++) {
        curSum = 0;
        for (int k = i; k <= j; k++) {
          curSum = curSum + numbers[k];
          if (maxSum < curSum) {
            maxSum = curSum;
          }
        }
      }
      // System.out.println(curSum);
    }
    System.out.println("max sum is:- "+ maxSum);
  }
  public static void main(String[] args) {
    int numbers[] = { 1, -2, 6, -1, 3 };
    maxSubarraySum(numbers);
  }
}
