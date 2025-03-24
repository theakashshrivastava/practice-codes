package data.structure.linked.list.single.deletion.code;

import data.structure.linked.list.single.Node;

public class DeleteAtEnd {
    public static void deleteFromLast(Node head)
    {
        while(head.data!=3)
        {
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println(head.data);
        head.next = null;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next = n2;
        Node n3 = new Node(3);
        n2.next = n3;
        Node n4 = new Node(0);
        n3.next = n4;

        deleteFromLast(n1);
        System.out.println(n3.next==null);
    }
}
