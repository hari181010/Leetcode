/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode mid=getmid(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return merge(left,right);
        
    }
     public ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode dummy=new ListNode();
        ListNode tail=dummy;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                tail.next=l1;
                l1=l1.next;
                tail=tail.next;
            }
            else
            {
                tail.next=l2;
                l2=l2.next;
                tail=tail.next;
            }
        }
        tail.next=(l1!=null)?l1:l2;
        return dummy.next;

        

    }
     ListNode getmid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        return slow;
      
    }
}