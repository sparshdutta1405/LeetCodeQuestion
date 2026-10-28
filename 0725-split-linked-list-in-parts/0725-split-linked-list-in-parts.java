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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode curr = head;
        while(curr != null){
            n++;
            curr = curr.next;
        }

        int baseSize = n / k;
        int remainder = n % k;

        ListNode[] result = new ListNode[k];
        curr = head;

        for(int i = 0;i < k; i++){
            if(curr == null){
                result[i] = null;
                continue;
            }

            result[i] = curr;
            int currentPartSize = baseSize + (i < remainder ? 1 : 0);

            for(int j = 0;j < currentPartSize - 1; j++){
                curr = curr.next;
            }

            ListNode nextPartHead = curr.next;
            curr.next = null;
            curr = nextPartHead;
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna