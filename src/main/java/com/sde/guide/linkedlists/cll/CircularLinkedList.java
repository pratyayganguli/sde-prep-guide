package com.sde.guide.linkedlists.cll;


class CircularLinkedList<T> {
    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;

    Node getHead() {
        return head;
    }

    /**
     * data will be inserted in the head position in the list.
     *
     * @param data
     */
    void insertHead(T data) {
        if(head == null) {
            System.out.println("No elements are present in the list!");
            head = new Node(data);
            head.next = head;
        } else {
            Node node = head;
            do {
                if(node.next == head) {
                    Node newNode = new Node(data);
                    node.next = newNode;
                    newNode.next = head;
                    head = newNode;
                    break;
                }
                node = node.next;
            } while(true);
        }
    }

    /**
     * data will be inserted in the tail position in the list.
     *
     * @param data
     */
    void insertTail(T data) {
        if(head == null) {
            head = new Node(data);
            head.next = head;
        } else {
            Node node = head;
            while(true) {
                if(node.next == head) {
                    Node newNode = new Node(data);
                    node.next = newNode;
                    newNode.next = head;
                    break;
                } else {
                    node = node.next;
                }
            }
        }
    }

    void deleteHead() {
        if(head == null) {
            System.out.println("No elements are present in the list!");
            return;
        }
        Node node = head;
        do {
            if(node.next == head) {
                head = head.next;
                node.next = head;
                break;
            }
            node = node.next;
        } while(true);
    }

    void deleteTail() {
        if(head == null) {
            System.out.println("No elements are present in the list!");
            return;
        }
        Node node = head;
        do {
            if(node.next.next == head) {
                node.next = head;
                break;
            }
            node = node.next;

        } while(true);

    }

    void showNodes() {
        if(head == null) {
            System.out.println("list is empty!");
            return;
        } else {
            Node node = head;
            do {
                System.out.println(node.data);
                node = node.next;
            } while(node != head);
        }
    }
}

class Main {
    public static void main(String[] args) {
        CircularLinkedList<String> cll = new CircularLinkedList<>();
        cll.insertTail("Ramesh");
        cll.insertTail("Suresh");
        cll.insertTail("Ganesh");
        cll.showNodes();
        cll.insertHead("Rakesh");
        cll.insertHead("Jignesh");
        System.out.println("--------------");
        cll.showNodes();
        cll.deleteHead();
        cll.deleteHead();
        cll.deleteTail();
        System.out.println("--------------");
        cll.showNodes();
    }
}
