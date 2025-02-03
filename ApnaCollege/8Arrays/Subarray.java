public class Subarray {
  public static void printSubarray(int numbers[]) {
    int ts = 0;
    int sum = 0;
    int smallest = Integer.MAX_VALUE;
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i; j < numbers.length; j++) {
        for (int k = i; k <= j; k++) {
          System.out.print(numbers[k] +","+ " ");
          sum = sum + numbers[k];
        }
        System.out.println("Sum is:- " + sum);
        ts++;
        if (largest < sum) {
          largest = sum;
        }
        if (smallest > sum) {
          smallest = sum;
        }
     /*    System.out.println("Greatest of all sum of subarray is:- " + largest);
        System.out.println("Smallest of all sum of subarray is:- " + smallest); */
        sum = 0;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("total subarrays:- " + ts);
    
  }
  public static void main(String[] args) {
    int numbers[] = { 2,4,6,8,10 };
    printSubarray(numbers);
  }  
}
