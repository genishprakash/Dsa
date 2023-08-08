package LinkedList;

import LinkedList.middleelement.ListNode;

public class bintoint {
    public int getDecimalValue(ListNode head) {
        int sum=0;
        while(head!=null){
            sum*=2;
            if(head.val==1){
                sum+=1;
            }
            head=head.next;
        }
        return sum;
    }
}
