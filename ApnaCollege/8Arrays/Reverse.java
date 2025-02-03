public class Reverse {
  public static void reverse(int numbers[]) {
    int start = 0;
    int end = numbers.length - 1;
    while (start < end) {
      int temp = numbers[start];
      numbers[start] = numbers[end];
      numbers[end]=temp;
      start++;
      end--;
    }
  }
  public static void main(String[] args) {
    int numbers[] = { 232, 232, 1, 21, 213, 2 };
    reverse(numbers);
    System.out.println("Reverse of the list :- ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
}
