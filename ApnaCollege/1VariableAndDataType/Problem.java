/* Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */
import java.util.*;
public class Problem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    float cost1 = sc.nextInt();
    float cost2 = sc.nextInt();
    float cost3 = sc.nextInt();
    float total = cost1 + cost2 + cost3;
    float newtotal = total + ((0.18f) * total);
    System.out.println(newtotal);
    sc.close();
  }
}
