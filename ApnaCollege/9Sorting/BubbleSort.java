/* Idea:- largest element come to an end of array by swapping adjacent element*/
public class BubbleSort {
  public static void bubbleSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      boolean swapped = false;
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;
        }
      }
      if (swapped = false) {
        break;
      }
    }
    
  }

  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
 public static void main(String[] args) {
   int arr[] = { 5,4,3,2,1};
   bubbleSort(arr);
   printArray(arr);
 } 
}
