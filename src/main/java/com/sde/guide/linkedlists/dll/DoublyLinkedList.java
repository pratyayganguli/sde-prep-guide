package com.sde.guide.linkedlists.dll;

/**
 *
 * Operations that needs to be implemented in Doubly Linked List:
 *
 * 1. Insertion at head.
 * 2. Insertion at Tail.
 * 3. Show all nodes.
 * 4. Reverse a Doubly linked list.
 * 5. Delete from head.
 * 6. Delete from tail.
 *
 * @param <T>
 */
class DoublyLinkedList<T> {
    class Node {
        T data;
        Node next;
        Node prev;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;


    /**
     *
     * The data should be inserted in the head.
     * @param data
     */
    void insertHead(T data) {
        if(head == null) {
            nullListHandler(data);
            return;
        }
        Node node = new Node(data);
        node.next = head;
        node.prev = tail;
        head = node;
        System.out.println("head: " + head.data + "; tail: " + tail.data);
    }


    /**
     *
     * The data should be inserted in the tail.
     * @param data
     */
    void insertTail(T data) {
        if(tail == null) {
            nullListHandler(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        head.prev = node;
        tail = node;
        System.out.println("head: " + head.data + "; tail: " + tail.data);
    }

    private void nullListHandler(T data) {
        System.out.println("There are no elements in the list!");
        head = new Node(data);
        head.next = tail;
        head.prev = tail;
        tail = head;
        tail.prev = head;
        tail.next = head;
    }

    /**
     *
     * pop element from the head
     */

    void deleteHead() {
        if(head == null) {
            System.out.println("No elements are present in the list");
            return;
        }
        head = head.next;
        head.prev = tail;
        tail.next = head;
        System.out.println("head: " + head.data + "; tail: " + tail.data);

    }

    void deleteTail() {
        if(tail == null) {
            System.out.println("No elements are present in the list");
            return;
        }

        tail = tail.next;
        head = tail.next;
        head.prev = tail;
        System.out.println("head: " + head.data + "; tail: " + tail.data);
    }

    void showNodes() {
        if(head == null) {
            System.out.println("no elements are present in the list");
            return;
        }
        System.out.println("-----------------");
        Node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;

        }while(temp != tail);
        System.out.println("-----------------");
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Doubly linked list example");
        DoublyLinkedList<String> dll = new DoublyLinkedList<>();
        dll.insertHead("Alex");
        dll.insertHead("Jeremy");
        dll.insertHead("Susan");
        dll.insertTail("Tupac");
        dll.insertTail("JayZ");
        dll.insertTail("Biggie");
        dll.showNodes();
        dll.deleteHead();
        dll.deleteTail();
        dll.showNodes();
    }
}