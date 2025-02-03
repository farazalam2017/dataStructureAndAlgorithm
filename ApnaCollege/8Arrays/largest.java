public class largest {
  public static int Largest(int numbers[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > largest) {
        largest = numbers[i];
      }
    }
    return largest;
  }
  public static int Smallest(int numbers[]) {
    int smallest = Integer.MAX_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] <smallest ) {
        smallest = numbers[i];
      }
    }
    return smallest;
  }
  public static void main(String[] args) {
    int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println("Largest is:- "+Largest(numbers));
    System.out.println("Smallest is:- "+Smallest(numbers));
  }
}