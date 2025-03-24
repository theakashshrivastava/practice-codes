package data.structure.linked.list.questions.gfg;

import data.structure.linked.list.single.Node;

import java.util.LinkedList;

public class Middle_of_LinkedList {
    public static void printMiddleNode(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;

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

        Node head = n1;
        printMiddleNode(head);
    }
}
