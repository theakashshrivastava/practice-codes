package data.structure.linked.list.single.insertion.code;

import data.structure.linked.list.single.Node;

public class InsertAtMid {
    public static void insertAtMid(Node head, Node left, Node right)
    {
        Node temp = new Node(3);
        left.next = temp;
        temp.next = right;
        while(head.next!=null)
        {
            System.out.println(head.data);
            head = head.next;
        }

        System.out.println(head.data);
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next = n2;
        Node n3 = new Node(4);
        n2.next = n3;
        Node n4 = new Node(5);
        n3.next = n4;
        System.out.println(n4.next==null);

        Node head = n1;
        Node left = n2;
        Node right = n3;
        insertAtMid(head,left,right);

    }
}
