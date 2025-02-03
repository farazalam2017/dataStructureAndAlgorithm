/* Problem:- Place N queens on an N*N chessboard such that no two queens can attack each other */
//................................................
//Variation 1:- Check if problem can be solved and print only 1 solution to N Queens.
/* public class NQueenAllWays {
  public static boolean isSafe(char board[][], int row, int col) {
    //vertically up
    for (int i = row - 1; i >= 0; i--) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }
    //diagonal left up
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    //diagonal right up
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    return true;
  }

  public static boolean nQueen(char board[][], int row) {
    //base case
    if (row == board.length) {
      count++;
      return true;
    }
    //column loop
    for (int j = 0; j < board.length; j++) {
      if (isSafe(board, row, j)) {
        board[row][j] = 'Q';
        if (nQueen(board, row + 1))//function call{
          return true;
      }
      board[row][j] = 'X';//backtrack step
    }
    return false;
  }

  public static void printBoard(char board[][]) {
    System.out.println("-------------- Chess board ------------");
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  static int count = 0;

  public static void main(String[] args) {
    int n = 2;
    char board[][] = new char[n][n];
    //initialize
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = 'X';
      }
    }
    if (nQueen(board, 0)) {
      System.out.println("Solution is possible");
      printBoard(board);
    } else {
      System.out.println("Solution is not possible");
    }
    System.out.println("Total ways to solve n queens:- " + count);
  }
} */
//Variation 2:- Count the number of ways in which we can solve N Queens problem and print all possible solution
public class NQueenAllWays {
  public static boolean isSafe(char board[][],int row, int col) {
    //vertically up
    for (int i = row - 1; i >= 0; i--) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }
    //diagonal left up
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    //diagonal right up
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    return true;
  }
  public static void nQueen(char board[][], int row) {
    //base case
    if (row == board.length) {
      printBoard(board);
      count++;
      return;
    }
    //column loop
    for (int j = 0; j < board.length; j++) {
      if (isSafe(board, row, j)) {
        board[row][j] = 'Q';
        nQueen(board, row + 1);//function call
        board[row][j] = 'X';//backtrack step
     }
    }
  }

  public static void printBoard(char board[][]) {
    System.out.println("-------------- Chess board ------------");
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  static int count = 0;
  public static void main(String[] args) {
    int n = 4;
    char board[][] = new char[n][n];
    //initialize
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = 'X';
      }
    }
    nQueen(board, 0);
    System.out.println("Total ways to solve n queens:- " + count);
  }
}
/* 
 * 1.Place n queen in n rows
 * 2. Place n queen in n rows in safe way(no two queens attack each other, isSafe())
 * 3.Count all ways of possible solution and print all those solution
 * 4.Check if solution is possible or not and print atleast one solution
 */

/* A. Place N Queen in N rows without chech whether it is safe to place queen in board or not */
/*  public class test {
  public static void nQueens(char board[][], int row) {
    //base
    if (row == board.length) {
      printBoard(board);
      return;
    }
    //column loop
    for (int j = 0; j < board.length; j++) {
      board[row][j] = 'Q';
      nQueens(board, row + 1);//function call
      //remove queen to empty space for other queen after backtrack
      board[row][j] = 'X';//backtrack step
    }
  }

  public static void printBoard(char board[][]) {
    System.out.println("----Chess Board---------");
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int n = 2;
    char board[][] = new char[n][n];
    //initialize
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = 'X';
      }
    }
    nQueens(board, 0);
  }
}
  */
//B. With safe mode
/* public class test {
  public static boolean isSafe(char board[][], int row, int col) {
    //vertically up
    for (int i = row - 1; i >= 0; i--) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }
    //diagonal left up
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    //diagonal right up
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    return true;
  }
  public static void nQueens(char board[][], int row) {
    //base
    if (row == board.length) {
      printBoard(board);
      return;
    }
    //column loop
    for (int j = 0; j < board.length; j++) {
      if (isSafe(board, row, j)) {
        board[row][j] = 'Q';
      nQueens(board, row + 1);//function call
      //remove queen to empty space for other queen after backtrack
      board[row][j] = 'X';//backtrack step
      }
      
    }
  }

  public static void printBoard(char board[][]) {
    System.out.println("----Chess Board---------");
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int n = 4;
    char board[][] = new char[n][n];
    //initialize
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = 'X';
      }
    }
    nQueens(board, 0);
  }
}  */
//C. Count total number of ways in which we can solve N Queen Problem
/* public class test {
  public static boolean isSafe(char board[][], int row, int col) {
    //vertically up
    for (int i = row - 1; i >= 0; i--) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }
    //diagonal left up
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    //diagonal right up
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    return true;
  }
  public static void nQueens(char board[][], int row) {
    //base
    if (row == board.length) {
      // printBoard(board);
      count++;
      return;
    }
    //column loop
    for (int j = 0; j < board.length; j++) {
      if (isSafe(board, row, j)) {
        board[row][j] = 'Q';
      nQueens(board, row + 1);//function call
      //remove queen to empty space for other queen after backtrack
      board[row][j] = 'X';//backtrack step
      }
      
    }
  }

  public static void printBoard(char board[][]) {
    System.out.println("----Chess Board---------");
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  static int count = 0;
  public static void main(String[] args) {
    int n = 5;
    char board[][] = new char[n][n];
    //initialize
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = 'X';
      }
    }
    nQueens(board, 0);
    System.out.println("Total ways to solve n queens:- " + count);
  }
} */

//D. Check if problem can be solved and print only 1 solution to N Queen problem
/* public class test {
  public static boolean isSafe(char board[][], int row, int col) {
    //vertically up
    for (int i = row - 1; i >= 0; i--) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }
    //diagonal left up
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    //diagonal right up
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    return true;
  }
  public static boolean nQueens(char board[][], int row) {
    //base
    if (row == board.length) {
      // printBoard(board);
      count++;
      return true;
    }
    //column loop
    for (int j = 0; j < board.length; j++) {
      if (isSafe(board, row, j)) {
        board[row][j] = 'Q';
        if (nQueens(board, row + 1)) {
          return true;
        } //function call
        //remove queen to empty space for other queen after backtrack
        board[row][j] = 'X';//backtrack step
      }

    }
    return false;
  }

  public static void printBoard(char board[][]) {
    System.out.println("----Chess Board---------");
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  static int count = 0;
  public static void main(String[] args) {
    int n = 2;
    char board[][] = new char[n][n];
    //initialize
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = 'X';
      }
    }
    if (nQueens(board, 0)) {
      System.out.print("Solution is possible");
      printBoard(board);
    } else {
      System.out.print("solution is not possible");
    }
    // System.out.println("Total ways to solve n queens:- " + count);
  }
}
 
 */