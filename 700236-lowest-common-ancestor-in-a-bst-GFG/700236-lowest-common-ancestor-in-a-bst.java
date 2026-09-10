/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    Node findLCA(Node root, Node n1, Node n2) {
        while (root != null) {
            if (n1.data < root.data && n2.data < root.data) {
                root = root.left;
            }else if (n1.data > root.data && n2.data > root.data) {
                root = root.right;
            }else {
                return root;
            }
        }
        return null;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna