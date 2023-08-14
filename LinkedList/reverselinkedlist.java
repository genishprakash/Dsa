package LinkedList;

import LinkedList.middleelement.ListNode;

public class reverselinkedlist {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null,curr=head,temp=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
        
        return head;
    }
    public ListNode reverseList1(ListNode head) {
        ListNode curr=head,curr1=head;
        int arr[]=new int[5001];
        int index=0;
        while(curr!=null){
            arr[index++]=curr.val;
            curr=curr.next;
        }
        for(int i=index-1;i>=0;i--){
            curr1.val=arr[i];
            curr1=curr1.next;
        }
        
        return head;
    }
}
