package main.DSA.linkedlists;

public class CircularLinedList {
    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    Node head;
    Node tail;
    public void insertAtEnd(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;

    }
    public boolean isCircular(){
        if(head == null)
            return false;
        return tail.next == head || tail.next == head.next;
    }
    public void display(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.val+ "->");
                temp =  temp.next;
            }while(temp != head);
        }
    }

    public void delete(int val){
        Node node = head;
        if(node == null)
            return;
        if(node.val == val){
            head = head.next;
            tail.next = head;
        }
        do{
            Node temp = node.next;
            if(temp.val == val){
                temp=temp.next;
                head.next = temp;
                break;
            }
            node = node.next;
        }while (node!=head);
    }

    public static void main(String[] args) {
        CircularLinedList cll = new CircularLinedList();
        cll.insertAtEnd(10);
        cll.insertAtEnd(11);
        System.out.println(cll.isCircular());
        cll.display();

    }
}
