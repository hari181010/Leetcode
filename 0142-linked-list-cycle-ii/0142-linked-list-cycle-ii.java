/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int lengthcycle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
           
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
            {
                int l=0;
               
                ListNode temp=slow;
                do
                {
                    temp=temp.next;
                    l++;
                }while(temp!=slow);
                return l;

            }
        }
        return 0;
    }
    public ListNode detectCycle(ListNode head) {
        int len=0;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
            {
                len=lengthcycle(slow);
                break;
            }
           
        }
        if(len==0)
        {
            return null;
        }
        ListNode f=head;
        ListNode s=head;
        while(len>0)
        {
            s=s.next;
            len--;
        }
        while(f!=s)
        {
            f=f.next;
            s=s.next;
        }
        return s;


        
    }
}