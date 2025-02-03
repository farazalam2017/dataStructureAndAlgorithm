class KeyRemoval{
	Node head;
	static class Node{
	int data;
	Node next;
	Node(int data){
	this.data= data;
	this.next=null;
	}
 }
	public void removal(int key){
	Node current= head;
	Node temp= null;
	while(current!=null && current.data!=key){
	temp=current;
	current= current.next;
}
	if(current==null) return;
	temp.next= current.next;
	}
	public void display(){
	Node current= head;
	while(current!=null){
		System.out.print(current.data+"->");
		current=current.next;
	}
	System.out.print("null");
}
	public static void main(String args[]){
		KeyRemoval list= new KeyRemoval();
		list.head= new Node(1);
		Node second= new Node(2);
		Node third= new Node(3);
		Node fourth= new Node(4);
		list.head.next= second;
		second.next=third;
		third.next= fourth;
		list.display();
		System.out.println();
		list.removal(3);
		list.display();
	}
}