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
    public ListNode rev(ListNode head){
        ListNode temp=head;
        while(head!=null){
            int aa = head.val;
            if(head.next!=null){
                head.val=head.next.val;
                head.next.val=aa;
                head=head.next.next;
            }
            else head=head.next;
        }
        return temp;
    }
    public ListNode swapPairs(ListNode head) {
        return rev(head);
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          