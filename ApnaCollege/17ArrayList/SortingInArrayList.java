/* Collections.sort(NameOfList) */
/* same as  */

import java.util.ArrayList;
import java.util.Collections;

public class SortingInArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> list1=new ArrayList<>();
    list1.add(1000);
    list1.add(201);
    list1.add(30);
    list1.add(412);
    list1.add(151);
    list1.add(126);
    System.out.println(list1);
    Collections.sort(list1);//Ascending
    System.out.println("Ascending order:- "+ list1);
    //descending
    Collections.sort(list1, Collections.reverseOrder());
    //comparator:- define logic what type of soring we have to done.
   // 
    System.out.println("Descending order:- "+ list1);

  }
}
