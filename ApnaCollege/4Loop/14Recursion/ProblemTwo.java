/* WAP to find the last occurences of element in array */
public class ProblemTwo {
  public static int lastOccurences(int arr[], int key, int i) {
    if (i == arr.length) {
      return -1;
    }
    int isFound = lastOccurences(arr, key, i + 1);
    if (isFound == -1 && arr[i] == key) {
      return i;
    }
    return isFound;
  }
  public static void main(String[] args) {
    int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
    System.out.println(lastOccurences(arr, 5, 0));
  }
}
