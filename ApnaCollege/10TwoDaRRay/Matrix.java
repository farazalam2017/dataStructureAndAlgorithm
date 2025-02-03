import java.util.*;

public class Matrix {
  public static boolean search(int matrix[][], int key) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == key) {
          System.out.println("found at cell (" + i + "," + j + ")");
          return true;
        }
      }
    }
    System.out.println("Key not found");
    return false;
  }
  public static void main(String[] args) {
    int matrix1[][] = new int[2][2];
    int n = matrix1.length;
    int m = matrix1[0].length;
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix1[i][j] = sc.nextInt();
      }
    }
    //output
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix1[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println(n + " " + m);

  }
}