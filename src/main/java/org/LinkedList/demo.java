package org.LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class demo {
    Node head;

    public void insertAtBegining(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

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

    public void insertAtPosition(int data , int position){
        Node newNode = new Node(data);
        //Inserting at the beginning
        if (position==1){
            newNode.next= head;
            head=newNode;
            return;
        }

    }



    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ➡️ ");
            current = current.next;
        }
        System.out.println(" NULL ");
    }

    public static void main(String[] args) {
        demo d = new demo();
//        Node first = new Node(10);
//        Node second = new Node(20);
//        Node third = new Node(30);
//
//
//        first.next = second;
//        second.next = third;
//        third.next = null;

        d.insertAtBegining(5);

        d.printList();
        d.insertAtEnd(12);
        d.printList();


    }
}
