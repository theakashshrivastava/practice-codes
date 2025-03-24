package data.structure.linked.list.questions.gfg;

import data.structure.linked.list.single.Node;

import java.util.LinkedList;

public class RemoveLoop {
    public static void deleteLoop(Node head)
    {
        boolean loopDetected = false;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                loopDetected = true;
                break;
            }
            head = head.next;
        }
        if(loopDetected)
            System.out.println("Yes, there is a loop in LinkedList");
        else
            System.out.println("No loop in Linked List");
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        n1.next = n2;
        Node n3 = new Node(4);
        n2.next = n3;
        n3.next = n2;

        Node head = n1;
        deleteLoop(head);
    }
}
