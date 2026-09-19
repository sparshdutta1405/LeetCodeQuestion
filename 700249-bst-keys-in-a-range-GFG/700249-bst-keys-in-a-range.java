/* Structure of BST tree Node
class Node {
    public int data;
    public Node left;
    public Node right;
    public Node(int val) {
        data = val;
        left = right = null;
    }
};
*/

class Solution {
    public ArrayList<Integer> nodesInRange(Node root, int low, int high) {
        ArrayList<Integer> result = new ArrayList<>();
        inorder(root, low, high, result);
        return result;
    }

    private void inorder(Node root, int low, int high, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }

        // Only traverse left if there could be elements >= low
        if (root.data > low) {
            inorder(root.left, low, high, result);
        }

        // Process current node
        if (root.data >= low && root.data <= high) {
            result.add(root.data);
        }

        // Only traverse right if there could be elements <= high
        if (root.data < high) {
            inorder(root.right, low, high, result);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna