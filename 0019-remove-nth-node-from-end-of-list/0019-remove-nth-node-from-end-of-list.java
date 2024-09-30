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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c=0;
        ListNode temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        int tar=c-n;
        if(tar==0)
        {
            return head.next;
        }
        ListNode prev=null;
        temp=head;
         for(int i=0;i<tar;i++)
        {
           prev=temp;
           temp=temp.next;
            
        }
        prev.next=temp.next;
        return head;

        
    }
}