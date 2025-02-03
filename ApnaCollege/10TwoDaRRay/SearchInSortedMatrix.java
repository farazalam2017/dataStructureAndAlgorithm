import java.util.*;
public class SearchInSortedMatrix{
  public static boolean staircaseSearch(int matrix[][], int key) {
    int i = 0;
    int row = matrix.length;
    int col = matrix[0].length - 1;
    while (i < row && col >= 0) {
      if (matrix[i][col] == key) {
        System.out.println("Found key at:- " + i + ", " + col);
        return true;
      } else if (key < matrix[i][col]) {
        col--;
      } else {
        i++;
      }
    }
    System.out.println("key not found");
    return false;
  }

  public static void sortMatrix(int matrix[][],int key) {
    for (int i = 0; i < matrix.length; i++) {
      Arrays.sort(matrix[i]);
    }
    printMatrix(matrix,key);
  }

  public static void printMatrix(int matrix[][], int key) {
    int n = matrix.length;
    int m = matrix[0].length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(" " + matrix[i][j]);
      }
      System.out.println();
    }
    staircaseSearch(matrix, key);
  }
  public static void main(String[] args) {
    int matrix[][] = { { 20, 30, 40, 10 }, { 45, 35, 25, 15 }, { 29, 27, 37, 48 }, { 33, 32, 50, 39 } };
    int key = 509;
    sortMatrix(matrix,key);

  }
}