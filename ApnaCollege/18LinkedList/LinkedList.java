/* 
 * add at first:- Time complexity:- O(1)
 * add at last:- Time complexity:- O(1)
 * print a list:- Time complexity:- O(n)
 * Add in the middle:- 
 */
/* 
 * Remove operation:- 
 * remove first
 * remove last
 */
public class LinkedList {
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
  //Methods
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
  //add at index i,
  public void add(int index, int data) {
    if (index == 0) {
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;
    while (i < index - 1) {
      temp = temp.next;
      i++;
    }
    //i=index-1; temp->prev
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public int removeFirst() {
    if (size == 0) {
      System.out.print("List is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int value = head.data;
      head = tail = null;
      size = 0;
      return value;
    }
    int value = head.data;
    head = head.next;
    size--;
    return value;
  }

  public int removeLast() {
    if (size == 0) {
      System.out.println("List is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int value = head.data;
      head = tail = null;
      size = 0;
      return value;
    }
    //prev= i=size-2
    Node prev = head;
    for (int i = 0; i < size - 2; i++) {
      prev = prev.next;
    }
    int value = prev.next.data;//tail.data
    prev.next = null;
    tail = prev;
    size--;
    return value;
  }
  //iterative search. O(n)
  public int iterativeSearch(int key) {
    Node temp = head;
    int i = 0;
    while (temp != null) {
      if (temp.data == key) {
        return i;
      }
      temp = temp.next;
      i++;
    }
    //key not found
    return -1;
  }
  //recursive search. O(n)
  //helper is the recursive function which is to be called
  public int helper(Node head, int key) {
    if (head == null) {
      return -1;
    }
    if (head.data == key) {
      return 0;
    }
    int index = helper(head.next, key);
    if (index == -1) {
      return -1;
    }
    return index + 1;
  }

  public int recursiveSearch(int key) {
    return helper(head, key);
  }
  //reverse a linked list(3 variable, 4 step), O(n)
  public void reverse() {
    Node previous = null;
    Node current = tail = head;
    Node next;
    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    head = previous;
  }
  //find and remove nth node from the end (important)
  public void deleteNthNodeFromEnd(int n) {
    //calculate size of linked list
    int size = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      size++;
    }
    if (n == size) {
      head = head.next;//removeFirst
      return;
    }
    //size-n
    int i = 1;
    int indexToFind = size - n;
    Node previous = head;
    while (i < indexToFind) {
      previous = previous.next;
      i++;
    }
    previous.next = previous.next.next;
    return;
  }
  //Palindrome check using turtle and hair approach(1+2))
  //1. Helper function for palindrome
  public Node findMid(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;//+1
      fast = fast.next.next;//+2
    }
    return slow;//return the middle
  }
  //2. palindrome check
  public boolean checkPalindrome() {
    //base case
    if (head == null || head.next == null) {
      return true;
    }
    //step 1:- find mid
    Node midNode = findMid(head);
    //step 2:- reverse 2nd half
    Node previous = null;
    Node current = midNode;
    Node next;
    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    Node right = previous;
    Node leftNode = head;
    //step 3:- check left and right half
    while (right != null) {
      if (leftNode.data != right.data) {
        return false;
      }
      leftNode = leftNode.next;
      right = right.next;
    }
    return true;
  }
  //detect cycle in linked list
  public static boolean isCycle() {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;//cycle exist
      }
    }
    return false;//cycle not exist
  }
  //remove cycle in a linked list
  public static void removeCycle() {
    //detect cycle
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) {
        cycle = true;
        break;
      }
    }
    if (cycle == false) {
      return;
    }
    //find meeting point
    slow = head;
    Node previous=null;//last node
    while (slow != fast) {
      previous = fast;
      slow = slow.next;
      fast = fast.next;
    }
    //remove cycle-> last.next=null
    previous.next = null;

  }
    public static void main(String[] args) {
      //check cycle in linked list
      head = new Node(1);
      Node temp = new Node(2);
      head.next = temp;
      head.next.next = new Node(3);
      head.next.next.next = temp;
      //1->2->3->1
      System.out.print(isCycle());
      //remove cycle
      System.out.print(isCycle());
      removeCycle();
      System.out.print(isCycle());

      /*  LinkedList ll = new LinkedList();
      ll.print();
      ll.addFirst(4);
      ll.print();
      ll.addFirst(3);
      ll.print();
      ll.addFirst(2);
      ll.print();
      ll.addFirst(1);
      ll.print();
      ll.addLast(5);
      ll.print();
      ll.add(2, 9);//add at index
      ll.print();
      ll.addLast(6);
      ll.print();
      ll.addLast(7);
      ll.print();
      ll.removeFirst();
      ll.print();
      ll.removeLast();
      ll.print();
      System.out.println("Size of linked list  is:- " + ll.size);
      System.out.println(ll.iterativeSearch(3));
      System.out.println(ll.iterativeSearch(10));
      System.out.println(ll.recursiveSearch(3));
      System.out.println(ll.recursiveSearch(10));
      ll.reverse();
      ll.print();
      ll.deleteNthNodeFromEnd(3);
      ll.print(); */
     //check if LL is palindrome or not
     /*  LinkedList ll1 = new LinkedList();
      ll1.addLast(1);
      ll1.addLast(2);
      ll1.addLast(2);
      ll1.addLast(11);
      ll1.print();
      System.out.println(ll1.checkPalindrome()); */
  }
}
