import java.util.*;
public class Array {
  public static void main(String[] args) {
    int marks[] = new int[10];
    Scanner sc = new Scanner(System.in);
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();
    System.out.println("Element 1:-" + marks[0]);
    System.out.println("Element 2:-" + marks[1]);
    System.out.println("Element 3:-" + marks[2]);
    System.out.println("Length of array is:- " + marks.length);
    sc.close();
  }
}
