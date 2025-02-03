import java.util.ArrayList;

public class Basic {
  public static void main(String[] args) {
    // String | Boolean | Float
    // ClassName objectName=new ClassName()
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<Boolean> list3 = new ArrayList<>();
    list1.add(1);//O(n)
    list1.add(2);
    list1.add(3);
    list1.add(4);
    list1.add(5);
    System.out.println(list1);
    //get operation
    int element = list1.get(2);
    System.out.println(element);
    //remove element
    list1.remove(2);
    System.out.println(list1);
    //set element at index
    list1.set(2, 101);
    System.out.println(list1);
    //contains element, check whether element exist or not
    System.out.println(list1.contains(1));
    System.out.println(list1.contains(12));
    //to add 9 at index 1
    list1.add(3, 9);//O(n)
    System.out.println(list1);
    //to get size of arrayList
    System.out.println(list1.size());
    //print array list using for loop
    for (int i = 0; i < list1.size(); i++) {
      System.out.print(list1.get(i) + " ");
    }
    System.out.println();


    





  }
}
