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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;


        ListNode newHead = null;
        ListNode end = null;

        int carry = 0;
        while(p1 != null || p2 != null){
            int a = p1!= null ? p1.val : 0;
            int b = p2!=null ? p2.val : 0;

            int sum = a + b + carry;

            if(sum >= 10){
                sum = sum % 10;
                carry = 1;
            }

            else{
                carry = 0;
            }

            ListNode temp = new ListNode();
            temp.val = sum;
            

            if(newHead == null){
                newHead = temp;
                end = temp;
            }
            else{
                end.next = temp;
                end = temp;
            }


            if(p1 != null)
                p1 = p1.next;
            
            if(p2 != null)
                p2 = p2.next;
            

        } 
        
        if(carry == 1 )
        end.next = new ListNode(1);

        return newHead;
    }
}