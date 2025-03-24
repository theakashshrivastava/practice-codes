package data.structure.linked.list.circular.insertion.code;

import data.structure.linked.list.circular.CNode;

import java.util.LinkedList;

public class InsertAtEnd {
    public static void insertAtLast(LinkedList<CNode> l1)
    {
        CNode tempNode = new CNode(5);
        //dummy Nodes
        CNode head = l1.getFirst();
        CNode last = l1.getLast();

        last.next = tempNode;
        tempNode.next = head;

        CNode copyHead = head;
        while(head.next!=copyHead)
        {
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        CNode n1 = new CNode(1);
        CNode n2 = new CNode(2);
        n1.next = n2;
        CNode n3 = new CNode(3);
        n2.next = n3;
        CNode n4 = new CNode(4);
        n3.next = n4;
        n4.next = n1;

        LinkedList<CNode> l1 = new LinkedList<>();
        l1.add(n1);
        l1.add(n2);
        l1.add(n3);
        l1.add(n4);

        insertAtLast(l1);
    }
}
