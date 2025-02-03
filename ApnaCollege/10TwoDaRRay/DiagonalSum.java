public class DiagonalSum {
  public static int sum(int matrix[][]) {
    int sum = 0;
    int n = matrix.length;
    // int m = matrix[0].length;
    // for (int i = 0; i < n; i++) {
    //   for (int j = 0; j < m; j++) {
    //     if (i == j) {
    //       sum += matrix[i][j];
    //     } else if ((i + j) == n - 1) {
    //       sum += matrix[i][j];
    //     }
    //   }
    // }
    int i;
    for (i = 0; i < n; i++)
      sum+=matrix[i][i];
     if(i!=n-1-i){
            sum+=matrix[i][n-i-1];
     }
     return sum; 
    }
    public static void main(String[] args) {
      int matrix[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
      System.out.print("Sum of diagonal of matrix is:- "+ sum(matrix));           
    }
    
}