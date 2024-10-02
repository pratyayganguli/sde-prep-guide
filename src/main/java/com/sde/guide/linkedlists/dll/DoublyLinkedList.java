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
        tail = head;
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
    }
}