class ReverseLL {
    static Node head;
    
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node reverse(Node head) {
        if (head == null) {
            return head;
        }
        Node current = head;
        Node previous = null;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        ReverseLL list = new ReverseLL();
        list.head = new Node(10);
        Node second = new Node(8);
        Node third = new Node(1);
        Node fourth = new Node(11);
        
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        
        System.out.println("Original list:");
        list.display(head);
        
        Node reverseListHead = list.reverse(head);
        
        System.out.println("Reversed list:");
        list.display(reverseListHead);
    }
}
