import java.util.*;

public class InbuiltSort {
  public static void printArray(Integer arr[]){
    for(int i= 0; i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String[] args) {
    Integer arr[] = { 32, 21, 21, 2, 21, 2, 4, };
    Arrays.sort(arr);
    printArray(arr);
    System.out.println();
    //sort in descending order, but expect object Intger instead of int
    Arrays.sort(arr, Collections.reverseOrder());
    printArray(arr);
  }

}
