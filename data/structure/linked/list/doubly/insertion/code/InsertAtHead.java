package data.structure.linked.list.doubly.insertion.code;

import data.structure.linked.list.doubly.DNode;

public class InsertAtHead {
    public static void insertAtFirst(DNode head)
    {
        DNode temp = new DNode(0);
        temp.next = head;
        while(temp.next!=null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String[] args) {
        DNode n1 = new DNode(1);
        DNode head = n1;
        insertAtFirst(head);

    }
}
