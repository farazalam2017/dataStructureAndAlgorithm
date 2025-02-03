public class PrefixSum {
  public static void MaxSubarraySumUsingPrefixSum(int numbers[]) {
    int curSum = 0;
    int maxSum = Integer.MIN_VALUE;
    //calculate prefix Sum
    int prefixArray[] = new int[numbers.length];
    prefixArray[0] = numbers[0];
    for (int i = 1; i < prefixArray.length; i++) {
      prefixArray[i] = prefixArray[i - 1] + numbers[i];
    }
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i; j < numbers.length; j++) {
        curSum = i==0 ? prefixArray[j]: prefixArray[j] - prefixArray[i - 1];
          if (curSum > maxSum) {
            maxSum = curSum;
          }
        }
      }
      System.out.println("Max Subarray Sum is:- " + maxSum);
    }
  
  public static void main(String[] args) {
    int numbers[] = { 1, -2, 6, -1, 3 };
    MaxSubarraySumUsingPrefixSum(numbers);
  }
}
