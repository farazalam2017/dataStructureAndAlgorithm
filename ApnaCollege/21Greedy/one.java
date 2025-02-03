/* Activity Selection */
/* O(n) without sorting */
/* O(nlogn) with sorting */
import java.util.*;
public class one {
  public static void main(String[] args) {
    int start[] = { 1, 3, 0, 5, 8, 5 };
    int end[] = { 2, 5, 6, 7, 9, 9 };
    //for sorting 
    int activities[][] = new int[start.length][3];
    for (int i = 0; i < start.length; i++) {
      activities[i][0] = i;
      activities[i][1] = start[i];
      activities[i][2] = end[i];
    }
    //lambda function-> short form of big function 
    Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));//sort according to column number 2 for ending time, 1 for start time

    //end time basis sort
    int maxActivity = 0;
    ArrayList<Integer> ans = new ArrayList<>();
    //1st activity
    maxActivity = 1;
    ans.add(activities[0][0]);
    int lastEnd = activities[0][2];
    for (int i = 1; i < end.length; i++) {
      if (activities[i][1] >= lastEnd) {
        //activity select
        maxActivity++;
        ans.add(activities[i][0]);
        lastEnd = activities[i][2];
      }
    }
    System.out.println("Maximum activity:- " + maxActivity);
    for (int i = 0; i < ans.size(); i++) {
      System.out.print("A" + ans.get(i) + " ");

    }
    System.out.println();
  }
}
