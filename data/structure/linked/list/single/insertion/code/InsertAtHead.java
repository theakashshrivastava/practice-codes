package data.structure.linked.list.single.insertion.code;

import data.structure.linked.list.single.Node;

public class InsertAtHead {
    public static void insertAtStart(Node head)
    {
        Node temp = new Node(5);
        temp.next = head;
        while(temp.next!=null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next = n2;
        Node n3 = new Node(3);
        n2.next = n3;
        Node n4 = new Node(4);
        n3.next = n4;
        System.out.println(n4.next==null);

        Node head = n1;
        insertAtStart(head);
    }
}
