#include <iostream>
#include <vector>
using namespace std;

// Node structure definition
struct Node
{
public:
    int data;
    Node *next;

    // Constructor with data and next pointer
    Node(int data1, Node *next1 = nullptr)
    {
        data = data1;
        next = next1;
    }
};

// Function to convert an array into a linked list
Node *convertArrayToLinkedList(vector<int> &arr)
{
    Node *head = new Node(arr[0]);
    Node *mover = head;
    for (int i = 1; i < arr.size(); i++)
    {
        Node *temp = new Node(arr[i]);
        mover->next = temp;
        mover = temp;
    }
    return head;
}

// Function to traverse and print the linked list
void traverseList(Node *head)
{
    Node *temp = head;
    while (temp)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}

// Function to calculate the length of the linked list
int lengthOfList(Node *head)
{
    int count = 0;
    Node *temp = head;
    while (temp)
    {
        count++;
        temp = temp->next;
    }
    return count;
}

// Function to check if a value is present in the linked list
bool isPresent(Node *head, int value)
{
    Node *temp = head;
    while (temp)
    {
        if (temp->data == value)
        {
            return true;
        }
        temp = temp->next;
    }
    return false;
}

// Insert at head
Node *insertAtHead(Node *head, int value)
{
    Node *temp = new Node(value, head);
    return temp;
}

// Insert at tail
Node *insertAtTail(Node *head, int value)
{
    if (head == nullptr)
    {
        return new Node(value);
    }
    Node *temp = head;
    while (temp->next != nullptr)
    {
        temp = temp->next;
    }
    temp->next = new Node(value);
    return head;
}

// Insert at a specific position
Node *insertAtPosition(Node *head, int element, int k)
{
    if (k == 1)
    {
        return insertAtHead(head, element);
    }

    Node *temp = head;
    for (int i = 1; i < k - 1 && temp != nullptr; i++)
    {
        temp = temp->next;
    }

    if (temp == nullptr) 
    {
        cout << "Position out of bounds!" << endl;
        return head;
    }

    Node *newNode = new Node(element, temp->next);
    temp->next = newNode;
    return head;
}

// Insert before a specific value
Node *insertBeforeValue(Node *head, int element, int value)
{
    if (head == nullptr)
    {
        return nullptr;
    }

    if (head->data == value)
    {
        return insertAtHead(head, element);
    }

    Node *temp = head;
    while (temp->next != nullptr && temp->next->data != value)
    {
        temp = temp->next;
    }

    if (temp->next == nullptr)
    {
        cout << "Value not found!" << endl;
        return head;
    }

    Node *newNode = new Node(element, temp->next);
    temp->next = newNode;
    return head;
}

// Delete at head
Node *deleteAtHead(Node *head)
{
    if (head == nullptr)
        return nullptr;

    Node *temp = head;
    head = head->next;
    delete temp;
    return head;
}

// Delete at tail
Node *deleteAtTail(Node *head)
{
    if (head == nullptr || head->next == nullptr)
        return deleteAtHead(head);

    Node *temp = head;
    while (temp->next->next != nullptr)
    {
        temp = temp->next;
    }

    delete temp->next;
    temp->next = nullptr;
    return head;
}

// Delete at a specific position
Node *deleteAtPosition(Node *head, int k)
{
    if (k == 1)
        return deleteAtHead(head);

    Node *temp = head;
    for (int i = 1; i < k - 1 && temp != nullptr; i++)
    {
        temp = temp->next;
    }

    if (temp == nullptr || temp->next == nullptr)
    {
        cout << "Position out of bounds!" << endl;
        return head;
    }

    Node *toDelete = temp->next;
    temp->next = temp->next->next;
    delete toDelete;
    return head;
}

// Delete by value
Node *deleteByValue(Node *head, int value)
{
    if (head == nullptr)
        return nullptr;

    if (head->data == value)
        return deleteAtHead(head);

    Node *temp = head;
    while (temp->next != nullptr && temp->next->data != value)
    {
        temp = temp->next;
    }

    if (temp->next == nullptr)
    {
        cout << "Value not found!" << endl;
        return head;
    }

    Node *toDelete = temp->next;
    temp->next = temp->next->next;
    delete toDelete;
    return head;
}

// Main function
int main()
{
    vector<int> arr = {12, 5, 7, 8};
    Node *head = convertArrayToLinkedList(arr);

    cout << "Original Linked List: ";
    traverseList(head);

    head = insertAtHead(head, 20);
    cout << "After inserting 20 at head: ";
    traverseList(head);

    head = insertAtTail(head, 30);
    cout << "After inserting 30 at tail: ";
    traverseList(head);

    head = insertAtPosition(head, 25, 3);
    cout << "After inserting 25 at position 3: ";
    traverseList(head);

    head = insertBeforeValue(head, 15, 7);
    cout << "After inserting 15 before 7: ";
    traverseList(head);

    head = deleteAtHead(head);
    cout << "After deleting at head: ";
    traverseList(head);

    head = deleteAtTail(head);
    cout << "After deleting at tail: ";
    traverseList(head);

    head = deleteAtPosition(head, 3);
    cout << "After deleting at position 3: ";
    traverseList(head);

    head = deleteByValue(head, 15);
    cout << "After deleting value 15: ";
    traverseList(head);

    return 0;
}
