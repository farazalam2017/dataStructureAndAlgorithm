class RemoveDulpicateFromSortedLL{
	Node head;
	static class Node{
	int data;
	Node next;
	Node(int data){
	this.data= data;
	this.next= null;
	}
}
	public void removeD(int value){
	if(head==null){
		return;
	}
	Node current= head;
	while(current!=null && current.next!=null){
	if(current.data==current.next.data){
	current.next= current.next.next;
}else{
	current= current.next;
}
}	
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
	RemoveDulpicateFromSortedLL list= new RemoveDulpicateFromSortedLL();
	list.head= new Node(1);
	Node second= new Node(1);
	Node third= new Node(2);
	Node fourth= new Node(3);
	list.head.next= second;
	second.next= third;
	third.next= fourth;
	list.display();
	System.out.println();
	list.removeD(1);
	list.display();
}
}