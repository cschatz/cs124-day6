// LeetCode solution

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // edge case: empty list!
        if (head == null)
            return null;
        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                // found a duplicate!
                current.next = current.next.next;
            } else {
                // no duplicate, just move forward normally
                current = current.next;
            }
        }
        return head;
    }
}
