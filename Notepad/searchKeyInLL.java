class searchKeyInLL{
	static Node head;
	static class Node{
	int data;
	Node next;
	Node(int data){
	this.data= data;
	this.next= null;
	}
 }
	public boolean search(Node head,int key){
	if(head==null){
		return false;
	}
	Node current= head;
	while(current!=null){
		if(current.data==key){
			return true;
		}
		current= current.next;
	}
	return false;
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
	searchKeyInLL list= new searchKeyInLL();
	list.head= new Node(10);
	Node second= new Node(8);
	Node third= new Node(1);
	Node fourth= new Node(11);
	list.head.next= second;
	second.next= third;
	third.next=fourth;
	list.display();
	System.out.println();
	if(list.search(head,11)){
		System.out.println("Search key found");
		}else{
		System.out.println("Search key not found");
		}
	}

}