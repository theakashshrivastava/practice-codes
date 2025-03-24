package data.structure.linked.list.circular;

public class Traversal {
    public static void iterateCircular(CNode head)
    {
        int count = 0;
        CNode temp = head;
        while(head.next!=temp)
        {
            System.out.println(head.data);
            head = head.next;
            count++;
        }
        System.out.println(head.data);
        count++;
        System.out.println("Total Nodes " + count);
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

        CNode head = n1;
        iterateCircular(head);
    }
}
