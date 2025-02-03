/* 
 * Pair sum-I
 * Find if any pair in a sorted arraylist has target sum
 * 
 */

import java.util.ArrayList;

public class PairSumI {
  //bruteforce
 /*  public static boolean PairSum(ArrayList<Integer> list, int target) {
   for (int i = 0; i < list.size(); i++) {
     for (int j = i + 1; j < list.size(); j++) {
       if (list.get(i) + list.get(j) == target) {
         return true;
       }
     }
   }
   return false;
 } */
 //2 pointer approach
 public static boolean PairSum(ArrayList<Integer> list, int target) {
   int leftPointer = 0;
   int rightPointer = list.size() - 1;
   while (leftPointer != rightPointer) {
     if (list.get(leftPointer) + list.get(rightPointer) == target) {
       return true;
     }
     if (list.get(leftPointer) + list.get(rightPointer) < target) {
       leftPointer++;
     } else {
       rightPointer--;
     }
   }
   return false;
 }
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    //1,2,3,4,5
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    int target = 52;
    System.out.print(PairSum(list, target));
  }
}
