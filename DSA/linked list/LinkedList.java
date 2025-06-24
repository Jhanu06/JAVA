class LinkedList {
    // Node class representing each node of the linked list
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    Node head;

    // Insert a node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert a node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Insert a node at a specific position
    public void insertAtPosition(int data, int position) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);
        if (position == 1) {
            insertAtBeginning(data);
            return;
        }

        Node current = head;
        int count = 1;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete a node at the beginning of the list
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Delete a node at the end of the list
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    // Delete a node at a specific position
    public void deleteAtPosition(int position) {
        if (position < 1 || head == null) {
            System.out.println("Invalid position or List is empty");
            return;
        }

        // Delete the first node
        if (position == 1) {
            head = head.next;
            return;
        }

        Node current = head;
        int count = 1;

        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            System.out.println("Position out of range");
            return;
        }

        current.next = current.next.next;
    }

    // Print the entire list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert nodes at the end
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        System.out.println("Linked List after inserting nodes at the end:");
        list.printList();

        // Insert at the beginning
        list.insertAtBeginning(5);
        System.out.println("Linked List after inserting 5 at the beginning:");
        list.printList();

        // Insert at a specific position (position 3)
        list.insertAtPosition(15, 3);
        System.out.println("Linked List after inserting 15 at position 3:");
        list.printList();

        // Delete at the beginning
        list.deleteAtBeginning();
        System.out.println("Linked List after deleting the first node:");
        list.printList();

        // Delete at the end
        list.deleteAtEnd();
        System.out.println("Linked List after deleting the last node:");
        list.printList();

        // Delete at a specific position (position 2)
        list.deleteAtPosition(2);
        System.out.println("Linked List after deleting the node at position 2:");
        list.printList();
    }
}
