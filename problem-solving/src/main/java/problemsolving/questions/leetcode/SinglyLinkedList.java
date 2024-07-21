package problemsolving.questions.leetcode;

public class SinglyLinkedList<T> {

    private Node head;
    private Node tail;
    private int count;

    class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    /**
     * insertion will be done at the tail
     * @param data
     */
    void insert(T data) {
        if(head == null) {
            head = new Node(data);
            tail = head;
        } else {
            Node node = new Node(data);
            node = tail.next;
            tail = node;
        }
        count += 1;
        System.out.println(head.data + "," + tail.data);
    }

    Node getMidNode() {
        int count = 0;
        if(head == null) {
            System.out.println("no elements in the linked list!");
            return null;
        } else {
            Node tempNode = head;
            while(tempNode != tail) {
                if(count >= (getCount()/2)) {
                    return tempNode;
                }
                tempNode = tempNode.next;
                count += 1;
            }
            return tempNode;
        }
    }

    int getCount() {
        return count;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        System.out.println(list.getCount());
        System.out.println(list.getMidNode().data);
    }
}
