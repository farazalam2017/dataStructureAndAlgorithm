import java.util.*;

//zero-one pattern
public class Pattern {
  public static void ZeroOnePattern(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("1");
        } else {
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }

  //Hollow Rectangle Pattern
  public static void HollowRectanglePattern(int n) {
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        if (i == 1 || j == 1 || i == 5 || j == 5) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  //Inverted and rotated half pyramid
  public static void InvertedHalfPyramidUsingStarPattern(int n) {
    for (int i = 1; i <= n; i++) {
      //space
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      //stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  //Inverted Half pyramid using numbers
  public static void InvertedHalfPyramidUsingNumbersPattern(int n) {

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n - i) + 1; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  //Floyd traingle
  public static void FloydTriangle(int n) {
    //Floyd triangle
    int count = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(" " + count);
        count++;
      }
      System.out.println();
    }
  }

  //Butterfly pattern
  public static void ButterFlyPattern(int n) {
    //1st Half
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    //2nd Half
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  //solid rhombus
  public static void SolidRhombus(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  //Hollow rhombus
  public static void HollowRhombus(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n; j++) {
        if (i == 1 || j == 1 || i == n || j == n) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  //Diamond pattern
  public static void DiamondPattern(int n) {
    //1st half
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
    //2nd half
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }

  //Number pyramid
  public static void NumberPyramid(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }

  //Palindromic pattern with numbers
  public static void palindromicPatternWithNumbers(int n) {
    for (int i = 1; i <= n; i++) {
      //spaces
      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }
      //descending
      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }
      //ascending
      for (int j = 2; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    do {
      System.out.print("*******************************************\n");
      System.out.println(" Select an option given below to generate pattern: ");
      System.out.print(
          " \n 1.ZeroOne Pattern \t 2. Hollow Rectangle Pattern \t 3.Inverted and rotated half pyramid using star \t 4.Inverted Half pyramid using numbers \t 5.Floyd Triangle \t  6. Butterfly pattern \t 7.Solid Rhombus. \t 8. Hollow Rhombus \t 9.Diamond pattern \t 10. Number Pyramid \t 11.Palindromic pattern with numbers \t \n 12.Exit \n Please, Make a choice: ");
      int num = sc.nextInt();
      switch (num) {
        case 1:

          System.out.print("Enter the value of n:- ");
          int n = sc.nextInt();
          ZeroOnePattern(n);
          break;

        case 2:
          System.out.print("Enter the value of n:- ");
          int n1 = sc.nextInt();
          HollowRectanglePattern(n1);
          break;

        case 3:
          System.out.print("Enter the value of n:- ");
          int n2 = sc.nextInt();
          InvertedHalfPyramidUsingStarPattern(n2);
          break;

        case 4:
          System.out.print("Enter the value of n:- ");
          int n3 = sc.nextInt();
          InvertedHalfPyramidUsingNumbersPattern(n3);
          break;

        case 5:
          System.out.print("Enter the value of n:- ");
          int n4 = sc.nextInt();
          FloydTriangle(n4);
          ;
          break;

        case 6:
          System.out.print("Enter the value of n:- ");
          int n5 = sc.nextInt();
          ButterFlyPattern(n5);
          ;
          break;

        case 7:
          System.out.print("Enter the value of n:- ");
          int n6 = sc.nextInt();
          SolidRhombus(n6);
          ;
          break;
        case 8:
          System.out.print("Enter the value of n:- ");
          int n7 = sc.nextInt();
          HollowRhombus(n7);
          break;
        case 9:
          System.out.print("Enter the value of n:- ");
          int n8 = sc.nextInt();
          DiamondPattern(n8);
          ;
          break;
        case 10:
          System.out.print("Enter the value of n:- ");
          int n9 = sc.nextInt();
          NumberPyramid(n9);
          ;
          break;
        case 11:
          System.out.print("Enter the value of n:- ");
          int n10 = sc.nextInt();
          palindromicPatternWithNumbers(n10);
          ;
          break;
        case 12:
          System.out.print(" You choosed: Exit");
          System.exit(0);
          break;
        default:
          System.out.print(" Something is wrong!! ");
          break;
      }
      System.out.println(" \n \n ********************************************** \n ");
    } while (true);
    
    
  }

}
 