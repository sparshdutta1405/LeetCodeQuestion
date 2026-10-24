/* Structure of a Linked list Node
 class Node {
    int data;
    Node next;
vocatype.
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node findIntersection(Node head1, Node head2) {
        // code here
        Node start = new Node(0);
        Node starter = start;
        
        Node one = head1;
        Node second = head2;
        
        while(one != null && second != null){
            if(one.data == second.data){
                starter.next = new Node(one.data);
                starter = starter.next;
                
                one = one.next;
                second = second.next;
            }else if (one.data > second.data){
                //We are moving further when the data in the node is not the same by first comparing since the whole list is sorted.                
                second = second.next;
            }else{
                one = one.next;
            }
        }
        return start.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna