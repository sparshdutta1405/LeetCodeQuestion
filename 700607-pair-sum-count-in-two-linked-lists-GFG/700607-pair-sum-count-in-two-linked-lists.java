/*Structure of a link list node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

class Solution {
    public int countPairs(Node head1, Node head2, int x) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        Node first = head1;
        while(first != null){
            set.add(first.data);
            first = first.next;
        }
        
        
        int count = 0;
        Node second = head2;
        
        while(second != null){
            if(set.contains(x - second.data)){
                count++;
            }
            second = second.next;
        }
        
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna