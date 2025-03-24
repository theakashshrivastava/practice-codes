package data.structure.linked.list.doubly;

public class DTraversal {
    public static void iterateDoubleList(DNode head)
    {
        while(head.next!=null)
        {
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        DNode n1 = new DNode(1);
        DNode n2 = new DNode(2);
        n1.next = n2;
        DNode n3 = new DNode(3);
        n2.prev = n1;
        n2.next = n3;
        DNode n4 = new DNode(4);
        n3.prev = n2;
        n3.next = n4;
        n4.prev = n3;
        n4.next = null;

        DNode head = n1;
        iterateDoubleList(head);
    }
}
