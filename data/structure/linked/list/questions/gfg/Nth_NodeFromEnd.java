package data.structure.linked.list.questions.gfg;

import data.structure.linked.list.single.Node;

public class Nth_NodeFromEnd {
    public static void printNthNode(Node head, int k)
    {
        Node slow = head;
        Node fast = head;
        for(int i=0; i<k; i++)
        {
            fast = fast.next;
        }
        while(fast!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next = n2;
        Node n3 = new Node(3);
        n2.next = n3;
        Node n4 = new Node(4);
        n3.next = n4;
        Node n5 = new Node(5);
        n4.next = n5;
        Node n6 = new Node(6);
        n5.next = n6;
        Node n7 = new Node(7);
        n6.next = n7;
        Node n8 = new Node(8);
        n7.next = n8;
        Node n9 = new Node(9);
        n8.next = n9;

        int k = 2;
        Node head = n1;
        printNthNode(head,k);
    }
}
