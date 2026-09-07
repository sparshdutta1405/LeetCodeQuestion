/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        Node pre = null;
        Node suc = null;
        
        Node curr = root;
        while (curr != null) {
            if (curr.data < key) {
                pre = curr;
                curr = curr.right; 
            } else {
                curr = curr.left;
            }
        }

            
        curr = root;
        while (curr != null) {
            if (curr.data > key) {
                suc = curr;
                curr = curr.left; 
            } else {
                curr = curr.right;
            }
        }

        ArrayList<Node> result = new ArrayList<>();
        result.add(pre);
        result.add(suc);
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna