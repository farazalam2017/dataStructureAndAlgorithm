class Stack{
	Node top;
	int length;
	class Node{
	int data;
	Node next;
	Node(int data){
		this.data= data;
	}	
	}
	public Stack(){
		top=null;
		length=0;
	}
	public int length(){
		return length;
	}
	public void push(int data){
		Node temp= new 	Node(data);
		temp.next= top;
		top= temp;
		length++;
	}
	public int pop(){
		int result= top.data;
		top= top.next;
		length--;
		return result;
	}
	public int peek(){
		return top.data;
	}
	public static void main(String args[]){
		Stack stack= new Stack();
		stack.push(10);
		stack.push(12);
		stack.push(11);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
}
}