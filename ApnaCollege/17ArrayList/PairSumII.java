/* Pair Sum-2 */
/* Find if any pair in a sorted and rotated arrayList has target sum */
/* O(n) */

import java.util.ArrayList;

public class PairSumII {
  public static boolean PairSumTwo(ArrayList<Integer> list, int target) {
    int breakingPoint = -1;
    int n=list.size();
    for (int i = 0; i < list.size(); i++) {

      if (list.get(i) > list.get(i + 1)) {//breakingPoint
        breakingPoint = i;
        break;
      }
    }
    int leftPointer = breakingPoint + 1;//smallest
    int rightPointer = breakingPoint;//largest
    while (leftPointer != rightPointer) {
      //case 1
      if (list.get(leftPointer) + list.get(rightPointer) == target) {
        return true;
      }
      //case 2
      if (list.get(leftPointer) + list.get(rightPointer) < target) {
        leftPointer = (leftPointer + 1) % n;
      } else {
        //case 3
        rightPointer = (n + rightPointer - 1) % n;
      }
    }
    return false;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);
    int target = 16;
    System.out.println(PairSumTwo(list, target));
  }
}
