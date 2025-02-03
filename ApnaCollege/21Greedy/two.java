/* Fractional Knapsack Problem */
import java.util.*;
public class two {
  public static void main(String[] args) {
    int value[] = { 60, 100, 120 };
    int weight[] = { 10, 20, 30 };
    int W = 50;
    double ratio[][] = new double[value.length][2];
    //0th col=> index; 1st column=> ratio
    for (int i = 0; i < value.length; i++) {
      ratio[i][0] = i;
      ratio[i][1] = value[i] / (double) weight[i];
    }
    //ascending sort
    Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
    int capacity = W;
    int finalValue = 0;
    for (int i = ratio.length - 1; i >= 0; i--) {
      int index = (int) ratio[i][0];
      if (capacity >= weight[index]) {//include full item
        finalValue += value[index];
        capacity -= weight[index];
      } else {
        //include fractional item
        finalValue += (ratio[i][1] * capacity);
        capacity = 0;
        break;
      }
    }
    System.out.println("final Value= "+ finalValue);
  }
}
