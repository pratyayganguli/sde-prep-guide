package com.sde.guide.linkedlists.sll;

class SinglyLinkedList<T> {

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

    // insert at head

    /**
     *
     * @param data
     */
    void insertHead(T data) {
        if(head == null) {
            System.out.println("head is empty");
            head = new Node(data);
            return;
        } else {
            Node node = new Node(data);
            node.next = head;
            head = node;
        }
    }

    // write the logic to add nodes in the tail;

    /**
     *
     * @param data
     */
    void insertTail(T data) {
        if(head == null) {
            System.out.println("list is empty");
            return;
        } else {
            Node temp = head;
            while(temp != null) {
                if(temp.next == null) {
                    Node node = new Node(data);
                    temp.next = node;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    // deleting from the head
    void deleteHead() {
        if(head == null) {
            System.out.println("list is empty!");
            return;
        } else {
            System.out.println("deleting data: " + head.data);
            head = head.next;
        }
    }

    // deleting from the tail
    void deleteTail() {
        if(head == null) {
            System.out.println("list is empty!");
            return;
        } else {
            Node temp = head;
            while(temp != null) {
                if(temp.next.next == null) {
                    System.out.println("deleting data: " + temp.next.data);
                    temp.next = null;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    void showNodes() {
        if(head == null) {
            System.out.println("list is empty!");
            return;
        } else {
            Node temp = head;
            while(temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    void showNodes(Node headNode) {
        if(headNode == null) {
            System.out.println("list is empty!");
            return;
        } else {
            Node temp = headNode;
            while(temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    boolean dataExists(T data) {
        if(head == null) {
            System.out.println("list is empty!");
        } else {
            Node temp = head;
            while(temp != null) {
                if(temp.data.equals(data)) {
                    return true;
                }
                temp = temp.next;
            }

        }
        return false;
    }


    // fixme: Try to think of a way in which you can reverse the linked list

    Node reverse(Node headNode) {
        if(headNode == null || headNode.next == null) {
            System.out.println("list is empty!");
            return headNode;
        } else {
             Node reversedHead = reverse(headNode.next);
             headNode.next.next = headNode;
             headNode.next = null;
             return reversedHead;
        }
    }
}

class Main {
    public static void main(String[] args) {
        SinglyLinkedList<String> sll = new SinglyLinkedList<>();
        sll.insertHead("Akash");
        sll.insertHead("Lengdon");
        sll.insertHead("Harsha");
        sll.insertHead("Pratyay");
        sll.showNodes();

        sll.insertTail("Danny");
        System.out.println("---------------");
        sll.showNodes();

        sll.deleteHead();
        sll.showNodes();

        System.out.println("----------------");
        sll.deleteTail();
        sll.showNodes();

        // check is data exists
        System.out.println(sll.dataExists("Harsha"));
        sll.showNodes(sll.reverse(sll.getHead()));
    }
}
