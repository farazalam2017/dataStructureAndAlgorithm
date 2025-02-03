
public class BinarySearch {
  public static int bin(int numbers[], int key) {
    int start = 0;
    int end = numbers.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (numbers[mid] == key) {
        return mid;
      }
      //right searching
      if (numbers[mid] < key) {
        start = mid + 1;
      }
      //left searching
      if (numbers[mid] > key) {
        end = mid - 1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int key = 3;
    System.out.println(bin(numbers, key));
  }

}