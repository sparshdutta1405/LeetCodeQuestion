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
        ListNode dumdum = new ListNode(0);
        dumdum.next = head;

        ListNode fast = dumdum;
        ListNode slow = dumdum;

        for(int i  = 0; i <= n; i++){
            fast = fast.next;
        }

        while(fast !=null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dumdum.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna