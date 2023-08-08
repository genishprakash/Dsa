package LinkedList;

import LinkedList.middleelement.ListNode;

public class remdupfromsorted {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode slow=head,fast=head.next;
        while(fast!=null){
            System.out.print(slow.val +"" + fast.val+" ");
            if(slow.val==fast.val){
                slow.next=fast.next;
                fast=fast.next;
            }
            else{
                slow=slow.next;
                fast=fast.next;
            }
        }
        return head;
        
    }
}
