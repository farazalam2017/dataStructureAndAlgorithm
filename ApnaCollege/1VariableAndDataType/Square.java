/* Question 2: In a program, input the side of a square. You have to output the area of the
square. */
import java.util.*;
public class Square {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int side = sc.nextInt();
    int area = 4 * side;
    System.out.println(area);
    sc.close();
  }
}
