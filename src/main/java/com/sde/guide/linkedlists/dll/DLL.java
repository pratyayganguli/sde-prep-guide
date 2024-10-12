package com.sde.guide.linkedlists.dll;

class DLL<T> {

    class Node {
        T data;
        Node prev;
        Node next;

        Node (T data) {
            this.data = data;
            // do nothing with the prev and next references.
        }
    }

    private Node head;
    private Node tail;


    // by default the insert method is designed in such a way, that the insertion will take place in the head position
    void insert(T data) {

        if(head == null) {
            System.out.println("No elements are there in the linked list, inserting one!");
            head = new Node(data);
            tail = head;
        } else {
            // initializing the temp node.
            Node tempNode = new Node(data);
            tempNode.next = head;
            head.prev = tempNode;
            head = tempNode;
        }
        System.out.println("Head node -> " + head.data + "; Tail node -> " + tail.data);
    }

    void traverseNodes() {
        if(head == null) {
            System.out.println("There is no node present!");
        } else {
            Node tempNode = head;
            while(tempNode != null) {
                System.out.println(tempNode.data);
                tempNode = tempNode.next;
            }
        }
    }

    void reverseTraversal() {
        System.out.println("::: Reverse Traversal :::");
        if(tail == null) {
            System.out.println("There is no node present!");
        } else {
            Node tempNode = tail;
            while(tempNode != null) {
                System.out.println(tempNode.data);
                tempNode = tempNode.prev;
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        // create a reference variable to DLL object and call the operation methods.

        DLL<String> friends = new DLL<>();
        friends.insert("Ravi");
        friends.insert("Shami");
        friends.insert("Virat");
        friends.traverseNodes();
        friends.reverseTraversal();
    }
}
