/* For given n lines on x axis, use 2 lines to form a container such that it holds maximum water 
 * height=[1,8,6,2,5,4,8,3,7]
*/

import java.util.ArrayList;

public class ContainerWithMaxWater {
  // bruteforce- O(n^2)
  /* public static int storedWater(ArrayList<Integer> height) {
    int maxWater = 0;
    for (int i = 0; i < height.size(); i++) {
      for (int j = i + 1; j < height.size(); j++) {
        int ht = Math.min(height.get(i), height.get(j));
        int width = j - 1;
        int currentWater = ht * width;
        maxWater = Math.max(maxWater, currentWater);
      }
    }
    return maxWater;
  } */
  //2 pointer approach
  public static int storedWater(ArrayList<Integer> height) {
    int maxWater = 0;
    int leftPointer = 0;
    int rightPointer = height.size() - 1;
    while (leftPointer < rightPointer) {
      //calulate water area
      int ht = Math.min(height.get(leftPointer), height.get(rightPointer));
      int width = rightPointer - leftPointer;
      int currentWater = ht * width;
      maxWater = Math.max(maxWater, currentWater);
      //update ptr
      if (height.get(leftPointer) < height.get(rightPointer)) {
        leftPointer++;
      } else {
        rightPointer--;
      }
    }
    return maxWater;
  }
  public static void main(String[] args) {
    ArrayList<Integer> height = new ArrayList<>();
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);
    System.out.print(storedWater(height));
  }
}
