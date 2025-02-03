/* Using Linked List from Java Collections*/
import java.util.LinkedList;
public class LinkedListInJavaCollection {
  public static void main(String[] args) {
    //create
    LinkedList<Integer> list1 = new LinkedList<>();
    //add
    list1.add(1);
    list1.addLast(2);
    list1.addFirst(0);
    //0->1->2
    System.out.println(list1);//[0,1,2]
    //remove
    list1.removeLast();
    list1.removeFirst();
    System.out.println(list1);//[1]

  }
  
}
