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
    ListNode getmid(ListNode head)
    {
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    ListNode reverse(ListNode head)
    {
        if(head ==null)
        {
            return head;
        }
        ListNode prev=null;
        ListNode present=head;
        ListNode next=present.next;
        while(present!=null)
        {
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null)
            {
                next=next.next;
            }
        }
        return prev;

    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
        {
            return ;
        }
        ListNode mid=getmid(head);
        ListNode h2=reverse(mid);
        ListNode h1=head;
        while(h1!=null && h2!=null)
        {
            ListNode temp=h1.next;
            h1.next=h2;
            h1=temp;
            temp=h2.next;
            h2.next=h1;
            h2=temp;
        }
        if(h1!=null)
        {
            h1.next=null;
        }

        
    }
}