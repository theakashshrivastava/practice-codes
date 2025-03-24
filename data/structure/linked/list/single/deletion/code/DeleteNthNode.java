package data.structure.linked.list.single.deletion.code;

import data.structure.linked.list.single.Node;

import java.util.LinkedList;

public class DeleteNthNode {
    public static void deleteNth(LinkedList<Node> l1,int n)
    {
        Node tempNode = l1.get(n-1);
        Node beforeTemp = l1.get(n-2);
        tempNode.next = null;
        beforeTemp.next = l1.getLast();

        Node head = l1.getFirst();
        while(head.next!=null)
        {
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println(head.data);
    }

    public static void main(String[] args) {
        Node n1 = new Node(0);
        Node n2 = new Node(1);
        n1.next = n2;
        Node n3 = new Node(3);
        n2.next = n3;
        Node n4 = new Node(2);
        n3.next = n4;

        LinkedList<Node> l1 = new LinkedList<>();
        l1.add(n1);
        l1.add(n2);
        l1.add(n3);
        l1.add(n4);

        int index = 3; //delete 3rd Node
        deleteNth(l1,index);
    }
}
