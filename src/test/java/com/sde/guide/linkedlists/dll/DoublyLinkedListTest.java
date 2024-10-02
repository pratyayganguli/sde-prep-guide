package com.sde.guide.linkedlists.dll;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * Consider this class as a scratch pad for determining a solution to the dll problem
 */
class DoublyLinkedListTest {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    private Node head;
    private Node tail;

    Node getHead() {
        return head;
    }

    Node getTail() {
        return tail;
    }

    // when there is no head and no tail i.e. the entire list is empty.
    void nullHandlerCase() {

        if(head == null || tail == null) {

            // we are hard-coding the value.
            head = new Node(10);
            head.next = tail;
            head.prev = tail;
            tail = head;
        }
    }

    void fistInsertion() {
        nullHandlerCase();
    }

    void insert(int data) {
        Node temp = new Node(data);
        temp.next = head;
        temp.prev = tail;
        head = temp;
    }

    // not considering the case if the head and tail is null.

    void showNodes() {
        Node temp = head;
        do {
            if(temp.prev != null) {
                System.out.print(temp.prev.data + "->");
            }
            System.out.print(temp.data + "->");
            if(temp.next != null) {
                System.out.print(temp.next.data);
            }
            System.out.println();
            temp = temp.next;
        } while(temp.next != null);

        System.out.println();
    }

    @Test
    void testInsertionCase() {
        fistInsertion();
        insert(15);
        insert(20);
        insert(25);
        showNodes();
    }
}