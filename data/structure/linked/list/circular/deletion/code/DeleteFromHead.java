package data.structure.linked.list.circular.deletion.code;
import data.structure.linked.list.circular.CNode;

import java.util.LinkedList;

public class DeleteFromHead {
    public static void deleteFirstNode(LinkedList<CNode> l1)
    {
        CNode head = l1.getFirst();
        head.next = null;
        CNode last = l1.getLast();
        CNode secNode = l1.get(1);
        last.next = secNode;
        CNode copySecond = secNode;
        while(secNode.next!=copySecond)
        {
            System.out.println(secNode.data);
            secNode = secNode.next;
        }
        System.out.println(secNode.data);
    }

    public static void main(String[] args) {
        CNode n1 = new CNode(0);
        CNode n2 = new CNode(1);
        n1.next = n2;
        CNode n3 = new CNode(2);
        n2.next = n3;
        CNode n4 = new CNode(3);
        n3.next = n4;
        n4.next = n1;

        LinkedList l1 = new LinkedList();
        l1.add(n1);
        l1.add(n2);
        l1.add(n3);
        l1.add(n4);

        deleteFirstNode(l1);
    }
}
