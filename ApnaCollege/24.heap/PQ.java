/* Java on primitives using Java Collection Framework */
import java.util.Comparator;
import java.util.PriorityQueue;
public class PQ {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq1 = new PriorityQueue<>();
    PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());//to arrange in descending Order
    pq1.add(3);  
    pq1.add(4);  
    pq1.add(7);
    while (!pq1.isEmpty()) {
      System.out.print(pq1.peek() + " ");
      pq1.remove();//3 4 7
    }
    System.out.println();
    pq2.add(3);  
    pq2.add(4);  
    pq2.add(7);
    while (!pq2.isEmpty()) {
      System.out.print(pq2.peek()+" ");
      pq2.remove();//3 4 7
    }  
  }
}
