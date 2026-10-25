/* Linked List Node Structure
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
        // code here
        Node first = new Node(arr[0]);
        Node temp = first;
        
        for(int i = 1; i < arr.length; i++){
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        
        return first;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna