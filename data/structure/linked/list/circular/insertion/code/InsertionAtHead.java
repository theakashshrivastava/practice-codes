package data.structure.linked.list.circular.insertion.code;

import data.structure.linked.list.circular.CNode;

import java.util.LinkedList;

public class InsertionAtHead {
    public static void insertAtStart(LinkedList<CNode> l1)
    {
        CNode tempNode = new CNode(0);
        tempNode.next = l1.getFirst();
        l1.getLast().next = tempNode;

        CNode copyTemp = tempNode;
        while(tempNode.next!=copyTemp)
        {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
        System.out.println(tempNode.data);


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

        insertAtStart(l1);
    }
}
