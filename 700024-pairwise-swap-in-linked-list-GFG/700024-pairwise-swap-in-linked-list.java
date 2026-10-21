/* Structure of linked list Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
};*/
class Solution {
    public Node pairwiseSwap(Node head) {
        // code here
        
        if(head.next == null || head == null){
            return head;
        }
        
        
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        
        
        while(prev.next != null && prev.next.next != null){
            Node first = prev.next;
            Node second = prev.next.next;
            
            
            first.next = second.next;
            second.next = first;
            prev.next = second;
            
            
            prev = first;
            
        }
        
        
        
        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna