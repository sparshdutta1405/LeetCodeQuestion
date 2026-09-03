/*
class Node {
    int data;
    Node left, right;
    Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class NodeValue {
    int maxNode, minNode, maxSize;
    boolean isBST;

    NodeValue(int minNode, int maxNode, int maxSize, boolean isBST) {
        this.minNode = minNode;
        this.maxNode = maxNode;
        this.maxSize = maxSize;
        this.isBST = isBST;
    }
}

class Solution {
    static int largestBst(Node root) {
        return postOrder(root).maxSize;
    }

    private static NodeValue postOrder(Node root) {
        // Base case: An empty tree is a valid BST of size 0
        if (root == null) {
            return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0, true);
        }

        // Post-order: solve subtrees first
        NodeValue left = postOrder(root.left);
        NodeValue right = postOrder(root.right);

        // Check if the current tree rooted at `root` is a valid BST
        if (left.isBST && right.isBST && left.maxNode < root.data && root.data < right.minNode) {
            int currentSize = 1 + left.maxSize + right.maxSize;
            int currentMin = Math.min(root.data, left.minNode);
            int currentMax = Math.max(root.data, right.maxNode);
            return new NodeValue(currentMin, currentMax, currentSize, true);
        }

        // If not a valid BST, pass the maximum size seen so far and mark invalid
        return new NodeValue(0, 0, Math.max(left.maxSize, right.maxSize), false);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna