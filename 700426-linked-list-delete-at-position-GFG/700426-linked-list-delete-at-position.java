/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(x == 1){
            return head.next;
        }
        
        
        int count = 1;
        Node temp = head;
        
        while(temp != null){
            // System.out.println(count);
            if(count == x-1){
                temp.next = temp.next.next;
            }
            count++;
            temp = temp.next;
        }
        
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna