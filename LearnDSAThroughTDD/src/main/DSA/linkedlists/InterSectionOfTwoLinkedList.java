package main.DSA.linkedlists;

public class InterSectionOfTwoLinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    Node head;
    public Node getIntersectionNode(Node headA, Node headB) {
        Node p = headA, q = headB;
        while (p!=q){
            p = p != null ? p.next : headB;
            q = q !=null ? q.next :headA;

        }
        return p;

    }
}
