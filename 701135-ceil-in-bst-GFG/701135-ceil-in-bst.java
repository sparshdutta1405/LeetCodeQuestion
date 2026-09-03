/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
} */


class Solution {
    int findCeil(Node root, int key) {
        int ceil = -1;

        while (root != null) {
            if (root.data == key) {
                return root.data;
            }

            if (root.data > key) {
                ceil = root.data;
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return ceil;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna