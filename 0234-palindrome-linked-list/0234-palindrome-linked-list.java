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
    ListNode reverse(ListNode head)
    {
        if(head==null )
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
    public boolean isPalindrome(ListNode head) {
        ListNode mid=getmid(head);
        ListNode heads=reverse(mid);
        ListNode rev=heads;
        while(head!=null && heads!=null)
        {
            if(head.val!=heads.val)
            {
                break;
            }
            head=head.next;
            heads=heads.next;
        }
        reverse(rev);
        return head==null || heads==null;
    }
}