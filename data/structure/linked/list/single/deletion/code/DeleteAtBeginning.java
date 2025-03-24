package data.structure.linked.list.single.deletion.code;

import data.structure.linked.list.single.Node;

public class DeleteAtBeginning {
    public static void deleteFromHead(Node head)
    {
        Node temp;
        temp = head.next;
        head.next = null;
        while(temp.next!=null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + "\n");
    }

    public static void main(String[] args) {
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        n0.next = n1;
        Node n2 = new Node(2);
        n1.next = n2;
        Node n3 = new Node(3);
        n2.next = n3;
        deleteFromHead(n0);
        System.out.println(n0.next==null);
    }
}
