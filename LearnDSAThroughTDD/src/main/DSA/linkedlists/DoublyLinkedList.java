package main.DSA.linkedlists;

public class DoublyLinkedList {
    private class  Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head;
    Node tail;
    int size;

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addAtLast(10);
    }

    public void addAtLast(int data) {
        Node newNode = new Node(data);
        tail.next = newNode;
        tail.prev = tail;
        tail = newNode;
        if(head == null){
            head = tail;
        }
        size++;
    }
    public void addAtFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;

    }
    public void display(){

    }

}
