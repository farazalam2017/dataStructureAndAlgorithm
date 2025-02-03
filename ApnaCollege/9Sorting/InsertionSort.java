/* Pick an element(from unsorted part) and place in right position in sorted part */
public class InsertionSort {
  public static void insertionSort(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      int curr = arr[i];
      int prev = i - 1;
      //finding the correct position to insert
      while (prev >= 0 && arr[prev] > curr) {
        arr[prev + 1] = arr[prev];
        prev--;
      }
      //insertion
      arr[prev + 1] = curr;
    }
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String[] args) {
    int arr[] = { 5, 4, 1, 3, 2 };
    insertionSort(arr);
    printArray(arr);
  }
}
