package LinkedList;

import org.w3c.dom.Node;



public class sort0s1s2s {
    class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
    static Node segregate(Node head)
    {
        // add your code here
        int arr[]=new int[3];
        Node temp=head,temp1=head;
        while(temp!=null){
            arr[temp.data]++;
            temp=temp.next;
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<arr[i];j++){
                temp1.data=i;
                temp1=temp1.next;
            }
        }
        return head;
    }
}
