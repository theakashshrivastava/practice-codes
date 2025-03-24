package data.structure.linked.list.doubly.deletion.code;

import data.structure.linked.list.doubly.DNode;

public class DeleteInBetween {
    public static void deleteFromIndex(DNode head, DNode left, DNode right,DNode rem)
    {
        left.next = right;
        right.prev = left;
        rem.prev = null;
        rem.next = null;
        while(head.next!=null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.print(head.data);
    }

    public static void main(String[] args) {
        DNode n1 = new DNode(1);
        DNode n2 = new DNode(2);
        n1.next = n2;
        n2.prev = n1;
        DNode n3 = new DNode(0);
        n2.next = n3;
        n3.prev = n2;
        DNode n4 = new DNode(3);
        n3.next = n4;
        n4.prev = n3;
        DNode n5 = new DNode(4);
        n4.next = n5;
        n5.prev = n4;

        DNode head = n1;
        DNode left = n2;
        DNode right = n4;
        DNode rem = n3;

        deleteFromIndex(head,left,right,rem);
    }
}
