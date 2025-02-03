import java.util.ArrayList;
/* Min_heap, ascending order */
/* public class InsertionInHeap {
  static class Heap {
    ArrayList<Integer> arr = new ArrayList<>();

    public void add(int data) {//O(log n)
      //add at last index
      arr.add(data);
      int x = arr.size() - 1;//x is child index
      int parent = (x - 1) / 2;//parent index
      while (arr.get(x) < arr.get(parent)) {//O(log n)
        //swap
        int temp = arr.get(x);
        arr.set(x, arr.get(parent));
        arr.set(parent, temp);
        x = parent;
        parent = (x - 1) / 2;
      }
    }

    public int peek() {
      return arr.get(0);
    }

    private void heapify(int i) {
      int left = 2 * i + 1;
      int right = 2 * i + 2;
      int minIndex = i;
      if (left < arr.size() && arr.get(minIndex) > arr.get(left)) {
        minIndex = left;
      }
      if (right < arr.size() && arr.get(minIndex) > arr.get(right)) {
        minIndex = right;
      }
      if (minIndex != i) {
        //swap
        int temp = arr.get(i);
        arr.set(i, arr.get(minIndex));
        arr.set(minIndex, temp);
        heapify(minIndex);
      }
    }

    public int remove() {
      int data = arr.get(0);
      //step 1:- swap firs and last
      int temp = arr.get(0);
      arr.set(0, arr.get(arr.size() - 1));
      arr.set(arr.size() - 1, temp);
      //step 2:- delete last
      arr.remove(arr.size() - 1);
      //step 3:- heapify
      heapify(0);
      return data;
    }

    public boolean isEmpty() {
      return arr.size() == 0;
    }
  }

  public static void main(String[] args) {
    Heap pq = new Heap();
    pq.add(3);
    pq.add(4);
    pq.add(1);
    pq.add(5);
    while (!pq.isEmpty()) {
      System.out.print(pq.peek()+" ");
      pq.remove();
    }
  }
} */
/* Max-heap, Descending Order */
public class InsertionInHeap {
  static class Heap {
    ArrayList<Integer> arr = new ArrayList<>();

    public void add(int data) {//O(log n)
      //add at last index
      arr.add(data);
      int x = arr.size() - 1;//x is child index
      int parent = (x - 1) / 2;//parent index
      while (arr.get(x) > arr.get(parent)) {//O(log n)
        //swap
        int temp = arr.get(x);
        arr.set(x, arr.get(parent));
        arr.set(parent, temp);
        x = parent;
        parent = (x - 1) / 2;
      }
    }

    public int peek() {
      return arr.get(0);
    }

    private void heapify(int i) {
      int left = 2 * i + 1;
      int right = 2 * i + 2;
      int maxIndex = i;
      if (left < arr.size() && arr.get(maxIndex) < arr.get(left)) {
        maxIndex = left;
      }
      if (right < arr.size() && arr.get(maxIndex) < arr.get(right)) {
        maxIndex = right;
      }
      if (maxIndex != i) {
        //swap
        int temp = arr.get(i);
        arr.set(i, arr.get(maxIndex));
        arr.set(maxIndex, temp);
        heapify(maxIndex);
      }
    }

    public int remove() {
      int data = arr.get(0);
      //step 1:- swap firs and last
      int temp = arr.get(0);
      arr.set(0, arr.get(arr.size() - 1));
      arr.set(arr.size() - 1, temp);
      //step 2:- delete last
      arr.remove(arr.size() - 1);
      //step 3:- heapify
      heapify(0);
      return data;
    }

    public boolean isEmpty() {
      return arr.size() == 0;
    }
  }

  public static void main(String[] args) {
    Heap pq = new Heap();
    pq.add(3);
    pq.add(4);
    pq.add(1);
    pq.add(5);
    while (!pq.isEmpty()) {
      System.out.print(pq.peek()+" ");
      pq.remove();
    }
  }
}