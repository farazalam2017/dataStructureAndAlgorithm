/* Find maximum in array list */
/* O(n) */
import java.util.ArrayList;

public class Maximum {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(2);
    list1.add(5);
    list1.add(9);
    list1.add(6);
    list1.add(8);
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < list1.size(); i++) {
      if (max < list1.get(i)) {
        max = list1.get(i);
      }
      // max = Math.max(max, list1.get(i));
    }
    System.out.print("Max element is:- "+ max);
  }
}
