/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public boolean isBST(Node root) {
        // code here
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private boolean isValid(Node node, long min, long max){
        if(node == null) return true;
        
        if(node.data <= min || node.data >= max){
            return false;
        }
        
        return isValid(node.left, min, node.data) && isValid(node.right, node.data, max);
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna