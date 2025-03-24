package data.structure.linked.list.doubly.deletion.code;

import data.structure.linked.list.doubly.DNode;

public class DeleteFromHead {
    public static void deleteFirst(DNode first,DNode second)
    {
        first.next = null;
        DNode head = second;

        while(head.next!=null)
        {
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        DNode n1 = new DNode(0);
        DNode n2 = new DNode(1);
        n1.next = n2;
        n2.prev = n1;
        DNode n3 = new DNode(2);
        n2.next = n3;
        n3.prev = n2;

        DNode first = n1;
        DNode second = n2;
        deleteFirst(first,second);
    }
}
