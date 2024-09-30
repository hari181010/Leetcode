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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode count=head;
        while(count!=null && count.next!=null)
        {
            if(count.val ==count.next.val)
            count.next=count.next.next;
            else
            count=count.next;
        }
        return head;

        
    }
}