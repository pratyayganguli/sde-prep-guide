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

    // this is the method through which we can insert node at the tail
    void insertTail(T data) {
        if(tail == null) {
            System.out.println("No elements are there in the linked list, inserting one!");
            tail = new Node(data);
            head = tail;
        } else {
            Node tempNode = new Node(data);
            tail.next = tempNode;
            tempNode.prev = tail;
            tail = tempNode;
        }
    }

    void deleteHead() {
        // head reference should be removed.
        if (head == null) {
            System.out.println("no elements are there in the head position");
            return;
        } else {
            System.out.println("removing data from the list: " + head.data);
            head = head.next;
            head.prev = null;
        }
    }

    void deleteTail() {
        // tail reference should be removed.
        if (tail == null) {
            System.out.println("no elements are there in the tail position");
            return;
        } else {
            System.out.println("removing data from the list: " + tail.data);
            tail = tail.prev;
            tail.next = null;
        }
    }

    void traverseNodes() {
        System.out.println(":::Traversal:::");
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

    void update(T data, T key) {
        if(head == null) {
            System.out.println("There are no elements in the list!");
        } else {
            Node tempNode = head;
            while(tempNode != null ) {

                // this is where we need to write the logic for updation of the node.
                if(tempNode.data == key) {
                    tempNode.data = data;
                }
                tempNode = tempNode.next;
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
        friends.insertTail("Rohit");
        friends.insertTail("Shubhman");
        friends.insertTail("Rahul");

        friends.traverseNodes();
        friends.reverseTraversal();
        friends.deleteHead();
        friends.traverseNodes();
        friends.deleteTail();
        friends.traverseNodes();
        friends.update("Dhoni", "Rohit");
        friends.traverseNodes();
    }
}
