/* Definition of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

class Solution {
    public Node sortedInsert(Node head, int key) {
        // code here
        
        Node keyy = new Node(key);
        
        //Empty list case
        if(head == null){
            return keyy;
        }
        
        //key is smaller than head
        if(head.data >= key){
            keyy.next = head;
            return keyy;
        }
        
        if(head.next == null){
            head.next = keyy;
            return head;
        }
        
        Node first  = head;
        Node second = head.next;
        
        
        while(second != null){
            if(second.data >= key){
                first.next = keyy;
                keyy.next = second;
                break;
            }
            
            first = first.next;
            second = second.next;
        }
        
        //We handle the edge case for the end of the list here because second pointer has reached the null 
        //So the first Node is at the second last position then we can insert the keyy Node at the end 
        first.next = keyy;
        
        
        
        return head;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna