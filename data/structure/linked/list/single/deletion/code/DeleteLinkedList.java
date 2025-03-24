package data.structure.linked.list.single.deletion.code;

import data.structure.linked.list.single.Node;

public class DeleteLinkedList {
    public static void freeLinkedList(Node head)
    {
        Node temp = head;
        head.next = null;
        while(temp.next!=null)
        {
            temp.next = temp;
            temp = null;
        }
        temp.next = null;
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
        freeLinkedList(head);
    }
}
