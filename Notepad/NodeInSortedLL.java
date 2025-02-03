class NodeInSortedLL{
	Node head;
	static class Node{
	int data;
	Node next;
	Node(int data){
	this.data= data;
	this.next=null;
	  }
	 }
public Node insert(int value){
	Node newNode= new Node(value);
	if(head==null){
		return newNode;
	}
	Node current= head;
	Node temp= null;
	while(current!=null && current.data<newNode.data){
	temp=current;
	current=current.next;
	}
	newNode.next=current;
	temp.next= newNode;
	return head;
}
public void display(){
	Node current= head;
	while(current!=null){
	System.out.print(current.data+"->");
	current= current.next;
	}
	System.out.print("null");
	}
	public static void main(String args[]){
	NodeInSortedLL list= new NodeInSortedLL();
	list.head= new Node(1);
	Node second= new Node(8);
	Node third= new Node(10);
	Node fourth= new Node(16);
	list.head.next=second;
	second.next= third;
	third.next= fourth;
	list.display();
	System.out.println();
list.insert(11);
	list.display();
} 	
}