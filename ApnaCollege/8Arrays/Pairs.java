public class Pairs {
  public static void pairs(int numbers[]) {
    int tpairs = 0;
    for (int i = 0; i < numbers.length; i++) {
      int current = numbers[i];
      for (int j = i + 1; j < numbers.length; j++) {
        System.out.println("(" + current + "," + numbers[j] + ")");
        tpairs++;
      }
    }
    System.out.println("Total pairs is:- " + tpairs);
  }
  public static void main(String[] args) {
    int numbers[] = { 1, 2, 3, 4, 5 };
    pairs(numbers);
  }
}
/* 
 * Time complexity:- O(n2)
 * Total number of pairs for n elements is:- n(n-1)/2;
 * 
 */