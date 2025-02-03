/* Minimum absolute difference pairs */
import java.util.*;
public class three {
  public static void main(String[] args) {//O(nlogn)
    int A[] = { 1, 2, 3 };
    int B[] = { 2, 1, 3 };
    Arrays.sort(A);
    Arrays.sort(B);
    int minDifference = 0;
    for (int i = 0; i < A.length; i++) {
      minDifference += Math.abs(A[i] - B[i]);
    }
    System.out.println("Minimum difference if pairs:- "+minDifference);
  }
}
