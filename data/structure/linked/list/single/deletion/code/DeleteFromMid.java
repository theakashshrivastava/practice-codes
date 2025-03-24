package data.structure.linked.list.single.deletion.code;

import data.structure.linked.list.single.Node;

public class DeleteFromMid {
    public static void deleteFromMiddle(Node head)
    {

        while(head.data!=2)
        {
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println(head.data);
        head = head.next.next;
        head.next = null;
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next = n2;
        Node n3 = new Node(0);
        n2.next = n3;
        Node n4 = new Node(3);
        n3.next = n4;

        deleteFromMiddle(n1);
    }
}
