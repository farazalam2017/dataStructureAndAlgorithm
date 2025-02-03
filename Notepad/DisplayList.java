public class DisplayList{
	Node head;
	public static class Node{
	int data;
	Node(int data){
	this.data= data;
	thid.next=null;
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
		Node list= new Node();
		list.head= new Node(1);
		Node second= new Node(2);
		Node third= new Node(3);
		list.head.next= second;
		second.next= third;
	}
}