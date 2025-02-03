class DetectLoop{
	Node head;
	static class Node{
	int data;
	Node next;
	Node(int data){
	this.data= data;
	this.next=null;
}
}
public boolean containLoop(){
	Node fastPtr= head;
	Node slowPtr= head;
	while(fastPtr!=null && fastPtr.next!=null){
		slowPtr= slowPtr.next;
		fastPtr= fastPtr.next.next;
		if(slowPtr==fastPtr){
		return true;
	}
	}
return false;
	
}
public static void main(String args[]){
		DetectLoop list= new DetectLoop();
		list. head= new Node(1);
		Node second= new Node(2);
		Node third= new Node(3);
		Node fourth= new Node(4);
		Node fifth= new Node(5);
		Node sixth= new Node(6);
		list.head.next= second;
		second.next= third;
		third.next= fourth;
		fourth.next= fifth;
		fifth.next= sixth;	
		sixth.next= third;
		System.out.println(list.containLoop());
	}
}