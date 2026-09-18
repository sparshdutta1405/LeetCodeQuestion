/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int maxDiameter;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        getDepth(root);
        return maxDiameter;
    }

    private int getDepth(TreeNode node){
        if(node == null)
        return 0;


        int left = getDepth(node.left);
        int right = getDepth(node.right);

        maxDiameter = Math.max(maxDiameter, left + right);

        return 1 + Math.max(left,right);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna