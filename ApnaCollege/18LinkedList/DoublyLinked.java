public class DoublyLinked {
  public class Node {
    int data;
    Node next;
    Node previous;
    public Node(int data) {
      this.data = data;
      this.next = null;
      this.previous = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;
  //add at first
  public void addAtFirst(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head.previous = newNode;
    head = newNode;
  }
  //print
  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "<->");
      temp = temp.next;
    }
    System.out.println("null");
  }
  //remove at last
  public int removeFirst() {
    if (head == null) {
      System.out.println("List is empty");
      return Integer.MIN_VALUE;
    }
    if (size == 1) {
      int value = head.data;
      head = tail = null;
      size--;
      return value;
    }
    int value = head.data;
    head = head.next;
    head.previous = null;
    size--;
    return value;
  }

  public void reverse() {
    Node current = head;
    Node previous = null;
    Node next;
    while (current != null) {
      next = current.next;
      current.next = previous;
      current.previous = next;
      previous = current;
      current = next;
    }
    head = previous;
  }
  public static void main(String[] args) {
    DoublyLinked dlist1 = new DoublyLinked();
    dlist1.addAtFirst(3);
    dlist1.addAtFirst(2);
    dlist1.addAtFirst(1);
    dlist1.print();
    System.out.println("Size of linked list is:- "+ dlist1.size);
    /* dlist1.removeFirst();
    dlist1.print();
    System.out.println("Size of linked list is:- "+ dlist1.size); */
    dlist1.reverse();
    dlist1.print();
  }
}
