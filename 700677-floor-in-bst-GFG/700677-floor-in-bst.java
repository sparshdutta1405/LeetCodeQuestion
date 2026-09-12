/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int findMaxFork(Node root, int x) {
        // code here.
        int floor = -1;
        
        while(root != null){
            if(root.data == x){
                return root.data;
            }
            
            if(root.data < x){
                floor = root.data;
                root = root.right;
            }else{
                root = root.left;
            }
        }
        
        return floor;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna