/* For a linked list of form:- L(1)->L(2)->L(3)->...->L(n-1)->L(n),
 * convert it into zig zag form i,e :- L(1)->L(n)->L(2)->L(n-1)->L(3)->L(n-2)
 * example:- 1->2->3->4->5
 *          1->5->2->4->3
*/
public class ZigZag {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  public static Node head;
  public static Node tail;
  public static int size;

  public void addFirst(int data) {
    //step1, create new node
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    //step2, newNode next=head
    newNode.next = head;//link
    //step3 head=newNode
    head = newNode;
  }
  public void addLast(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }
  public void print() {
    if (head == null) {
      System.out.print("List is empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  private Node getMid(Node head) {
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;//mid node
  }

  public void zigzag() {
    //find mid
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    Node mid = slow;
    //reverse 2nd half
    Node current = mid.next;
    mid.next = null;
    Node previous = null;
    Node next;
    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    Node left = head;
    Node right = previous;
    Node nextL, nextR;
    //alternate merge- zig-zag merge
    while (left != null && right != null) {
      nextL = left.next;
      left.next = right;
      nextR = right.next;
      right.next = nextL;
      left = nextL;
      right = nextR;
    }


  }
  public static void main(String[] args) {
    ZigZag list1 = new ZigZag();
    list1.addLast(1);
    list1.addLast(2);
    list1.addLast(3);
    list1.addLast(4);
    list1.addLast(5);
    list1.addLast(6);
    //5->4->3->2->1
    list1.print();
    list1.zigzag();
    list1.print();

  }
  
}
