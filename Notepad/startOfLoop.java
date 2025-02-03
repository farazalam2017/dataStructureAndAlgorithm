class startOfLoop{
	Node head;
	static class Node{
	int data;
	Node next;
	Node(int data){
	this.data= data;
	this.next=null;
}
}
public Node startNodeInLoop(){
	Node fastPtr= head;
	Node slowPtr= head;
	while(fastPtr!=null && fastPtr.next!=null){
		slowPtr= slowPtr.next;
		fastPtr= fastPtr.next.next;
		if(slowPtr==fastPtr){
		return getStartingNode(slowPtr);
	}
	}
return null;	
}
public Node getStartingNode(Node slowPtr){
	Node temp= head;
	while(temp!=slowPtr){
		temp= temp.next;
		slowPtr= slowPtr.next;
	}
	return temp;
}
public static void main(String args[]){
		startOfLoop list= new startOfLoop();
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
		System.out.println(list.startNodeInLoop().data);
	}
}