package data.structure.linked.list.single.insertion.code;

import data.structure.linked.list.single.Node;

public class InsertAtTail {
    public static void insertAtLast(Node head, Node last)
    {
        Node temp = new Node(5);
        last.next = temp;
        while(head.next!=null)
        {
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next = n2;
        Node n3 = new Node(3);
        n2.next = n3;
        Node n4 = new Node(4);
        n3.next = n4;

        Node head = n1;
        Node last = n4;
        insertAtLast(head,last);
    }
}
