package data.structure.linked.list.doubly.insertion.code;

import data.structure.linked.list.doubly.DNode;

public class InsertAtTail {
    public static void insertAtEnd(DNode head, DNode tail)
    {
        DNode temp = new DNode(2);
        tail.next = temp;
        while(head.next!=null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.print(head.data);

    }

    public static void main(String[] args) {
        DNode n1 = new DNode(0);
        DNode n2 = new DNode(1);
        n1.next = n2;
        n2.prev = n1;

        DNode head = n1;
        DNode tail = n2;
        insertAtEnd(head,tail);
    }
}
