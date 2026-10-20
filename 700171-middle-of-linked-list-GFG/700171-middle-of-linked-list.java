/* Linked List Node Structure
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        int count = 0;
        Node temp = head;
        
        while(temp != null){
            count++;
            temp = temp.next;
        }
        
        int mid = count/2;
        // System.out.println(mid);
        int counter = 0;
        
        temp = head;
        
        if(count % 2 == 0){
            while(counter != mid){
                temp = temp.next;
                counter++;
                // System.out.println(counter);
            }
            // System.out.println(temp.next.data);
            return temp.data;
        }else{
            while(counter != mid){
                temp = temp.next;
                counter++;
            }
            return temp.data;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna