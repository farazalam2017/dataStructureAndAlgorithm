import java.util.ArrayList;

public class Swap {
  public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
    int temp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2, temp);
  }
public static void main(String[] args) {
  ArrayList<Integer> list1 = new ArrayList<>();
  list1.add(2);
  list1.add(5);
  list1.add(6);
  list1.add(9);
  list1.add(3);
  int index1 = 1;
  int index2 = 3;
  System.out.println(list1);
  swap(list1, index1, index2);
  System.out.println(list1);
}  
}
