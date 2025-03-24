package data.structure.linked.list.single;

public class Traversal {
    public static void printList(Node head)
    {
        while(head.next!=null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next = n2;
        Node n3 = new Node(3);
        n2.next = n3;
        Node n4 = new Node(4);
        n3.next = n4;
        System.out.println(n4.next==null);

        Node head = n1;
        printList(head);
    }
}
