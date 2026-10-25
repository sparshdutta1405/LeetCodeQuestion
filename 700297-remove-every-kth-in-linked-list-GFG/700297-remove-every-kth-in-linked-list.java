/* structure for link list node
class Node {
    Node next;
    int data;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node deleteK(Node head, int k) {
        // Your code here
        //if k is less than 0 or the list is empty
        if(head == null || k <= 0){
            return head;
        }
        
        
        // if the k is 1 
        if(k == 1){
            return null;
        }
        
        Node current = head;
        int count = 1;
        
        while (current != null && current.next != null){
            if(count == k-1){
                //Stopping at k-1 to check the Node at k and directly removing it by pointing to the after next node
                current.next = current.next.next;
                count = 1;
                //resetting the counter for the multiple 
            }else {
                count++;
            }
            current = current.next;
            
        }
        
        return head;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna