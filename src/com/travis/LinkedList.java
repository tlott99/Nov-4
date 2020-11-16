package com.travis;

public class LinkedList {

    public Node head;

    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public void push(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
}
