class MiddleofSLL {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node getMiddle() {
        if (head == null) {
            return null;
        }
        Node slowPtr = head;
        Node fastPtr = head;

        // Move fastPtr by two steps and slowPtr by one step until fastPtr reaches the end
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr; // slowPtr will be at the middle node
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MiddleofSLL list = new MiddleofSLL();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        // Linking the nodes
        list.head.next = second;
        second.next = third;
        third.next = fourth;

        // Displaying the list
        list.display();

        // Getting the middle node and displaying its data
        Node middleNode = list.getMiddle();
        if (middleNode != null) {
            System.out.println("Middle node data: " + middleNode.data);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
