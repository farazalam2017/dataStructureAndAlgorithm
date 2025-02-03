public class LinkedList {  
  public Node head;
  static class Node {
    int data;
    Node next;
    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void insertAtLast(int value){
	Node newNode= new Node(value);
	if(head==null){
	head=newNode;
	return;
	}
	Node current= head;
	while(current.next!=null){
		current= current.next;
	}
	current.next= newNode;
  }
  public void insertAtFirst(int value){
	Node newNode= new Node(value);
	newNode.next= head;
	head=newNode;
  }
  public void insertAtPos(int data, int pos){
	Node node= new Node(data);
	if(pos==1){
		node.next=head;
		head= node;
	}else{
		Node previous= head;
		int count=1;
		while(count<pos-1){
		previous= previous.next;
		count++;
		}
		Node current= previous.next;
		previous.next= node;
		node.next= current;
	}	
  }

public Node deleteFirst(){
	if(head==null){
	return null;
	}
	Node temp=head;
	head= head.next;
	temp.next=null;
	return temp;
  }
public Node deleteLast(){
	if(head==null || head.next==null)	{
		return head;
	}
	Node current= head;
	Node previous= null;
	while(current.next!=null){
		previous= current;
		current= current.next;
	}
	previous.next=null;
	return current;
}
public void deleteAtPos(int pos){
	if(pos==1){
	head= head.next;
	}else{
		Node previous= head;
		int count=1;
		while(count<pos-1){
			previous= previous.next;
			count++;
		}
		Node current= previous.next;
		previous.next= current.next;
	}	
}
  public void display() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + "->");
      current = current.next;
    }
    System.out.print("null");
  }
  
  public int length(){
	int count=0;
	Node current=head;
	while(current!=null){
		count++;
		current=current.next;
	}
	return count;
	}
  public static void main(String args[]) {
    LinkedList list = new LinkedList();
   // list.head = new Node(1);
  //  Node second = new Node(2);
   // Node third = new Node(3);
   // list.head.next = second;
   // second.next = third;
    list.insertAtFirst(0);
    list.insertAtLast(1);
    list.insertAtLast(2);
    list.insertAtLast(3);
list.insertAtPos(4,5);
list.insertAtPos(5,6);
	list.deleteFirst();
	list.deleteLast();
	list.deleteAtPos(3);
    list.display();
    System.out.println();
    System.out.println("Length of Linked List is:- " + " " + list.length());
  }

}