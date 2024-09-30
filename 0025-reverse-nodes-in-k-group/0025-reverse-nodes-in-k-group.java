class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupTail = dummy;
        
        while (true) {
            ListNode currentGroupStart = prevGroupTail.next;
            ListNode current = currentGroupStart;
            ListNode prev = null;
            ListNode next = null;
            boolean hasKNodes = true;
            
            // Check if there are at least k nodes remaining
            for (int i = 0; i < k; i++) {
                if (current == null) {
                    hasKNodes = false;
                    break;
                }
                current = current.next;
            }
            if (!hasKNodes) {
                break;
            }
            
            // Reverse k nodes
            current = currentGroupStart;
            for (int i = 0; i < k; i++) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            
            // Connect the last node of the previous reversed group to the first node of the current reversed group
            prevGroupTail.next = prev;
            currentGroupStart.next = current;
            prevGroupTail = currentGroupStart;
        }
        
        return dummy.next;
    }
}
