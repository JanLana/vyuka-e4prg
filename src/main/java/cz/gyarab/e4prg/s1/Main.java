package cz.gyarab.e4prg.s1;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void printList() {
        Node temp = head;
        StringBuffer out = new StringBuffer();

        while (temp != null) {
            out.append(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(out);
    }

    // Inefficient implementation of reversing a linked list
    void reverseListInefficient() {
        Node current = head;
        Node previous = null;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < 10000000; i++)
            linkedList.insertAtBeginning(i);

        System.out.println("Original linked list:");
        linkedList.printList();

        linkedList.reverseListInefficient();

        System.out.println("Reversed linked list:");
        linkedList.printList();
    }
}