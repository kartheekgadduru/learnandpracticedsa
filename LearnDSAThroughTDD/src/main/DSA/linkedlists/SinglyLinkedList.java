package main.DSA.linkedlists;

public class SinglyLinkedList {
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
    int size;
    public void insertAtFirst(int data){
        Node newNode = new Node(data); // create a newNode
        newNode.next = head; //point newly created node next to head
        head = newNode; // now shift head to newNode
        if(tail == null){
            tail = head;
        }
        size++;

    }
    public void insertAtEnd(int data){
        if(tail == null){ // initially if tail is empty add both head and tile pointing newly created node
            insertAtFirst(data);
            return;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    public void display(){
        Node temp =head; // we are using temporary variable to traversing the linkedlist
        while (temp!=null){
            System.out.print(temp.val +"-->");
            temp = temp.next;
        }
        System.out.print("END of LINKED LIST");
    }

    public void insert(int data, int index){
        if(index == 0){
            insertAtFirst(data);
            return;
        }
        if(index == size){
            insertAtEnd(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data, temp.next);  // we are breaking the link and
        temp.next = newNode; // assign newly created node to temp.next

        size++;

    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        /*sll.insertAtEnd(10);
        sll.insertAtEnd(22);
        sll.insertAtEnd(33);
        sll.insertAtEnd(44);*/
        sll.insertAtEnd(1);
        sll.insertAtEnd(2);
        sll.insertAtEnd(3);
        sll.insertAtEnd(4);
        sll.insertAtEnd(5);
        sll.display();
        sll.reverseListAtTwoIndexes(2,4);
        sll.display();


    }

    public boolean isLoopExist(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }

       return false;
    }
    public int indexAtWhereTheyMeet(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }
        if(fast == null || fast.next == null)
            return -1;
        int position  = 0;

        slow = head;
        while(slow != fast){
            position+=1;
            slow = slow.next;
            fast = fast.next;
        }
        return position;
    }
    public void deleteDuplicates(){
        Node first;
        Node second;
    }

    public void reverseLinkedList(){
        Node left = head, previous = null;
        while (left != null){
            Node temp = left.next;   // assign next sub list to temp variable
            left.next = previous;  // break the link and assign to null initially
            previous = left;      //Shift the initial previous null to left
            left = temp;         // update the left/start to next sub list which is temp
        }
    }

    public boolean isPalindrome(){
       Node fast = head, slow = head;
       while(fast != null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
       }
        Node prev = null;
       /*Reverse the second half of the list */
        while(slow != null){
            Node temp = slow.next;
            slow.next = prev; // here we are breaking pointer link and moving the same to previous (whenever you are breaking assign desired node to node.next
            prev = slow; // here I am shifting my previous to slow
           slow = temp; // and shifting slow pointer to next (right)
        }
        /*now check for Palindrome using previous and start of node*/
        Node left = head, right = prev;
        while (right != null){ // we need to check for right is not null as we have created prev from midle using slow pointer
            if(left.val == right.val){
                left = left.next;
                right = right.next;
            }else{
                return false;
            }
        }
        return true;

    }

    public void mergeTwoSortedLinkedList(Node list1, Node list2){
    }

    /*https://leetcode.com/problems/reverse-linked-list-ii/*/
    public void reverseListAtTwoIndexes(int l, int r){
        if(head.next == null){
            return;
        }
        Node left  = head, leftPrevious = null;
        for (int i = 0; i < l -1; i++) {
            leftPrevious = left;
            left = left.next;
        }
        Node previous = null;
        for (int i = 0; i < l - r + 1; i++) {
            Node temp = left.next;
            left.next = previous;
            previous = left;
            left  = temp;
        }
        while (left!=null){
            leftPrevious.next = previous;
            leftPrevious.next.next = left.next;

        }


    }

    public void removeDuplicates(){
        Node current = head;
        while(current != null && current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
    }

    public void removeDuplicatesII(){
        Node current = head, previous = null;
        while(current != null && current.next != null){
            if(current.val == current.next.val){
                previous.next = current.next.next;
            }else{
                previous = current;
                current = current.next;
            }
        }
    }



}


 class Demo2 {
    public static synchronized void m1()  {
        System.out.println("I'm a static synchronized method");
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public synchronized void m2() {
        System.out.println("I'm a non-static synchronized method");
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String ...args)  {
        Demo2 a1 = new Demo2();
        Demo2 a2 = new Demo2();

        Thread t1 = new Thread( () -> {
            a1.m1();
        });
        Thread t2 = new Thread( () -> {
            a1.m2();
        });
        t1.start();
        t2.start();
    }
}
