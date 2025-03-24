package data.structure.linked.list.circular.deletion.code;

import data.structure.linked.list.circular.CNode;

import java.util.LinkedList;

public class DeleteFromEnd {
    public static void deleteLast(LinkedList<CNode> l1)
    {
        CNode head = l1.getFirst();
        CNode copyHead = head;

        CNode beforeLast = l1.get(l1.size()-2);
        l1.getLast().next = null;
        beforeLast.next = head;

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

        LinkedList l1 = new LinkedList();
        l1.add(n1);
        l1.add(n2);
        l1.add(n3);
        l1.add(n4);

        deleteLast(l1);
    }
}
